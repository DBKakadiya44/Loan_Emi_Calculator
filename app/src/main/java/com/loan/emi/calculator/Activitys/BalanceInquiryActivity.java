package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityBalanceInquiryBinding;

public class BalanceInquiryActivity extends AppCompatActivity {
    ActivityBalanceInquiryBinding binding;
    int MY_PERMISSIONS_REQUEST_CALL_PHONE = 100;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBalanceInquiryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

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

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container), 1);

        int position = getIntent().getIntExtra("cnt", 0);

        if (position == 1) {
            binding.imageView.setImageResource(R.drawable.bl1);
            binding.textView3.setText("Andhra Bank");
        }
        if (position == 2) {
            binding.imageView.setImageResource(R.drawable.bl2);
            binding.textView3.setText("Allahabad Bank");
        }
        if (position == 3) {
            binding.imageView.setImageResource(R.drawable.bl3);
            binding.textView3.setText("Bank Of India Bank");
        }
        if (position == 4) {
            binding.imageView.setImageResource(R.drawable.bl4);
            binding.textView3.setText("Canara Bank");
        }
        if (position == 5) {
            binding.imageView.setImageResource(R.drawable.bl5);
            binding.textView3.setText("Central Bank Of India Bank");
        }
        if (position == 6) {
            binding.imageView.setImageResource(R.drawable.bl7);
            binding.textView3.setText("HDFC Bank");
        }
        if (position == 7) {
            binding.imageView.setImageResource(R.drawable.bl6);
            binding.textView3.setText("Federal Bank");
        }
        if (position == 8) {
            binding.imageView.setImageResource(R.drawable.bl8);
            binding.textView3.setText("ICICI Bank");
        }
        if (position == 9) {
            binding.imageView.setImageResource(R.drawable.bl9);
            binding.textView3.setText("IDBI Bank");
        }

        binding.dialer.setOnClickListener(view -> {

            String number = String.valueOf(binding.editText.getText());

            if(number.length()==10){
                String phoneNumber = "tel:" + number;

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(phoneNumber));

                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)
                        == PackageManager.PERMISSION_GRANTED) {
                    startActivity(callIntent);
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},
                            MY_PERMISSIONS_REQUEST_CALL_PHONE);
                }
            }else {
                Toast.makeText(this, "Enter Valid Number", Toast.LENGTH_SHORT).show();
            }
        });

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