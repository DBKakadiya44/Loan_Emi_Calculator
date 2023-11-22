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
import com.loan.emi.calculator.databinding.ActivityInsuranceBinding;

public class InsuranceActivity extends AppCompatActivity {
    ActivityInsuranceBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInsuranceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container),1);

        Native aNative1 = new Native(this);
        aNative1.ShowNative(this, findViewById(R.id.native_container1),1);

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

        binding.ins1.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 16);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 16);
                    startActivity(intent);
                }
            });

        });
        binding.ins2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 17);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 17);
                    startActivity(intent);
                }
            });
        });
        binding.ins3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 18);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 18);
                    startActivity(intent);
                }
            });
        });
        binding.ins4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 27);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 27);
                    startActivity(intent);
                }
            });
        });
        binding.ins5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 19);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 19);
                    startActivity(intent);
                }
            });
        });
        binding.ins6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 20);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 20);
                    startActivity(intent);
                }
            });
        });


        binding.ins11.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 21);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 21);
                    startActivity(intent);
                }
            });
        });
        binding.ins12.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 22);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 22);
                    startActivity(intent);
                }
            });
        });
        binding.ins13.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 23);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 23);
                    startActivity(intent);
                }
            });
        });
        binding.ins14.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 24);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 24);
                    startActivity(intent);
                }
            });
        });
        binding.ins15.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 25);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 25);
                    startActivity(intent);
                }
            });
        });
        binding.ins16.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 26);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(InsuranceActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 26);
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