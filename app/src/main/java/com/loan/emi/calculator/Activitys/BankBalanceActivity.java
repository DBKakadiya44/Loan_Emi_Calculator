package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.MainActivity;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityBankBalanceBinding;

public class BankBalanceActivity extends AppCompatActivity {
    ActivityBankBalanceBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBankBalanceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container),3);

        Native aNative1 = new Native(this);
        aNative1.ShowNative(this, findViewById(R.id.native_container1),3);

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

        binding.bank1.setOnClickListener(view -> {

            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 1);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 1);
                    startActivity(intent);
                }
            });


        });
        binding.bank2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 2);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 2);
                    startActivity(intent);
                }
            });
        });
        binding.bank3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 3);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 3);
                    startActivity(intent);
                }
            });
        });
        binding.bank4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 4);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 4);
                    startActivity(intent);
                }
            });
        });
        binding.bank5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 5);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 5);
                    startActivity(intent);
                }
            });
        });
        binding.bank6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 6);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 6);
                    startActivity(intent);
                }
            });
        });
        binding.bank7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 7);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 7);
                    startActivity(intent);
                }
            });
        });
        binding.bank8.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 8);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 8);
                    startActivity(intent);
                }
            });
        });
        binding.bank9.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(BankBalanceActivity.this, BalanceInquiryActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
                }
            });
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
        },5000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}