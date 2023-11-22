package com.loan.emi.calculator;

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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.BannerAD;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.Activitys.AadharActivity;
import com.loan.emi.calculator.Activitys.BankBalanceActivity;
import com.loan.emi.calculator.Activitys.CreditCardActivity;
import com.loan.emi.calculator.Activitys.CreditScoreActivity;
import com.loan.emi.calculator.Activitys.DocumentsActivity;
import com.loan.emi.calculator.Activitys.EPFActivity;
import com.loan.emi.calculator.Activitys.FinanceActivity;
import com.loan.emi.calculator.Activitys.InsuranceActivity;
import com.loan.emi.calculator.Activitys.LoanTypeActivity;
import com.loan.emi.calculator.Activitys.MutualFundActivity;
import com.loan.emi.calculator.Activitys.NearByActivity;
import com.loan.emi.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    InterstitialAD helper;
    private BannerAD bannerAd = null;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container),1);

        LinearLayout banner = findViewById(R.id.bannerLayout);
        bannerAd = new BannerAD(this, banner);
        bannerAd.loadBannerAd();

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

        binding.ll1.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , LoanTypeActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , LoanTypeActivity.class));
                }
            });

        });

        binding.ll2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , AadharActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , AadharActivity.class));
                }
            });

        });

        binding.ll3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , MutualFundActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , MutualFundActivity.class));
                }
            });

        });

        binding.ccl1.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , FinanceActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , FinanceActivity.class));
                }
            });

        });
        binding.ccl2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , BankBalanceActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , BankBalanceActivity.class));
                }
            });

        });
        binding.ccl3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , CreditCardActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , CreditCardActivity.class));
                }
            });

        });
        binding.ccl4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , NearByActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , NearByActivity.class));
                }
            });

        });
        binding.ccl5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , EPFActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , EPFActivity.class));
                }
            });

        });
        binding.ccl6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , CreditScoreActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , CreditScoreActivity.class));
                }
            });

        });
        binding.ccl7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , InsuranceActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , InsuranceActivity.class));
                }
            });

        });
        binding.ccl8.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    startActivity(new Intent(MainActivity.this , DocumentsActivity.class));
                }

                @Override
                public void onInterstitialDismissed() {
                    startActivity(new Intent(MainActivity.this , DocumentsActivity.class));
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