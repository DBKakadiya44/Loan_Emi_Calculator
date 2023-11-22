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
import com.loan.emi.calculator.databinding.ActivityCcScoreBinding;

public class CcScoreActivity extends AppCompatActivity {
    ActivityCcScoreBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCcScoreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container), 1);

        adsManager = new AdsManager(this);
        helper = new InterstitialAD(this, this, adsManager);

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

        binding.cc1.setOnClickListener(view -> {

            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 9);
                    startActivity(intent);
                }
            });


        });
        binding.cc2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 10);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 10);
                    startActivity(intent);
                }
            });
        });
        binding.cc3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 11);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 11);
                    startActivity(intent);
                }
            });
        });
        binding.cc4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 12);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 12);
                    startActivity(intent);
                }
            });
        });
        binding.cc5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 13);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 13);
                    startActivity(intent);
                }
            });
        });
        binding.cc6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 14);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 14);
                    startActivity(intent);
                }
            });
        });
        binding.cc7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 15);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(CcScoreActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 15);
                    startActivity(intent);
                }
            });
        });
        binding.cc8.setOnClickListener(view -> {
            Intent intent = new Intent(CcScoreActivity.this, FaqsActivity.class);
            startActivity(intent);
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