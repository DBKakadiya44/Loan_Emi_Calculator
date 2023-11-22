package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityCalculateBinding;

public class CalculateActivity extends AppCompatActivity {
    ActivityCalculateBinding binding;
    int position = 0;

    EditText edtAmount;
    EditText edtRate;
    EditText edtDuration;
    TextView ll_Calculate;
    TextView imgReset;
    InterstitialAD helper;
    AdsManager adsManager = null;
    TextView txtNetAmount,txtInterest,txtTotalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container),1);

        adsManager = new AdsManager(this);
        helper = new InterstitialAD(this,this,adsManager);

        binding.imageView7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    onBackPressed();
                }

                @Override
                public void onInterstitialDismissed() {
                    onBackPressed();
                }
            });

        });


        edtAmount = findViewById(R.id.edtAmount);
        edtRate = findViewById(R.id.edtRate);
        edtDuration = findViewById(R.id.edtDuration);
        ll_Calculate = findViewById(R.id.ll_Calculate);
        imgReset = findViewById(R.id.imgReset);
        txtNetAmount = findViewById(R.id.txtNetAmount);
        txtInterest = findViewById(R.id.txtInterest);
        txtTotalAmount = findViewById(R.id.txtTotalAmount);

        binding.imgReset.setOnClickListener(view -> {
            binding.edtAmount.setText("");
            binding.edtRate.setText("");
            binding.edtDuration.setText("");
            binding.txtNetAmount.setText("0");
            binding.txtInterest.setText("0");
            binding.txtTotalAmount.setText("0");
        });

//        imgBack=findViewById(R.id.imgBack);

        ll_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateEMI();
            }
        });

        /*imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });*/

        imgReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearInputs();
            }
        });


        position = getIntent().getIntExtra("cnt",0);

        if(position==1)
        {

            binding.tv1.setText("Loan Amount :");
            binding.tv2.setText("Interest In Month :");
            binding.tv3.setText("How Many Years :");

            binding.textView18.setText("Home Loan EMI Calculator");

            binding.tv11.setText("Net Amount");
            binding.tv22.setText("Total Interest");
        }
        if(position==2)
        {

            binding.textView18.setText("Return On Investment");

            binding.tv11.setText("Investment Period");
            binding.tv22.setText("Gain or Loss");
        }
        if(position==3)
        {

            binding.textView18.setText("Fixed Deposit");

            binding.tv1.setText("Deposit Amount :");
            binding.tv2.setText("Rate Of Return % :");
            binding.tv3.setText("Loan Duration (Year) :");

            binding.tv11.setText("Net Amount");
            binding.tv22.setText("Total Interest");
        }
        if(position==4)
        {

            binding.tv1.setText("Investment Amount :");
            binding.tv2.setText("Rate Of Interest % :");
            binding.tv3.setText("Loan Duration (Year) :");

            binding.textView18.setText("Recurring Deposit");

            binding.tv11.setText("Total Investment");
            binding.tv22.setText("Total Interest");
        }

    }

    private void calculateEMI() {
        double loanAmount = Double.parseDouble(edtAmount.getText().toString());
        double interestRate = Double.parseDouble(edtRate.getText().toString());
        double loanDuration = Double.parseDouble(edtDuration.getText().toString());

        double monthlyInterestRate = (interestRate / 12) / 100;
        double numberOfPayments = loanDuration * 12;
        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        double totalInterest = (emi * numberOfPayments) - loanAmount;
        double totalAmount = emi * numberOfPayments;

        txtNetAmount.setText(String.format("%.2f", loanAmount));
        txtInterest.setText(String.format("%.2f", totalInterest));
        txtTotalAmount.setText(String.format("%.2f", totalAmount));
    }

    private void clearInputs() {
        edtAmount.setText("");
        edtRate.setText("");
        edtDuration.setText("");
        txtNetAmount.setText("000.00");
        txtInterest.setText("000.00");
        txtTotalAmount.setText("000.00");
    }

    private void showAlertDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Data Loading..."); // Set your loading message
        progressDialog.setCancelable(false);
        progressDialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        },3000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}