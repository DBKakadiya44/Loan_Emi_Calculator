package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityDetailPageBinding;

public class DetailPageActivity extends AppCompatActivity {
ActivityDetailPageBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailPageBinding.inflate(getLayoutInflater());
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

        int pos = getIntent().getIntExtra("cnt",0);

        if(pos==1)
        {
            binding.textView18.setText("Car Loan");

            binding.tv1.setText(getString(R.string.car1));
            binding.tv2.setText(getString(R.string.car2));
            binding.tv3.setText(getString(R.string.car3));
        }
        if(pos==2)
        {
            binding.textView18.setText("Business Loan");

            binding.tv1.setText(getString(R.string.business1));
            binding.tv2.setText(getString(R.string.business2));
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==3)
        {
            binding.textView18.setText("Home Loan");

            binding.tv1.setText(getString(R.string.home1));
            binding.tv2.setText(getString(R.string.home2));
            binding.tv3.setText(getString(R.string.home3));
        }
        if(pos==4)
        {
            binding.textView18.setText("Education Loan");

            binding.tv1.setText(getString(R.string.edu1));
            binding.tv2.setText(getString(R.string.edu2));
            binding.tv3.setText(getString(R.string.edu3));
        }
        if(pos==5)
        {
            binding.textView18.setText("Gold Loan");

            binding.tv1.setText(getString(R.string.gold1));
            binding.tv2.setText(getString(R.string.gold2));
            binding.tv3.setText(getString(R.string.gold3));
        }
        if(pos==6)
        {
            binding.textView18.setText("Personal Loan");

            binding.tv1.setText(getString(R.string.persnal1));
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==7)
        {
            binding.textView18.setText("Card number Validator");

            binding.tv1.setText("✤ The card number is one of the most important of credit cards. it identifies your account with the card issuer and they provide the digits you need to make purchases online or by phone. it's typically 16 digits, though some manufactures use as little as 14 and as many as 19 digits.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==8)
        {
            binding.textView18.setText("Card number Introduction");

            binding.tv1.setText("✤ Free Credit Card Number Validator is a free application that allows you to check your card number and specify the type of card. The algorithm used to process the Luhn algorithm or Luhn formula, also known as the modulus 10 or mod 10 algorithm, is a simple checksum formula used to validate a variety of identification numbers.");
            binding.tv2.setText("✤ Free Credit Card BIN checker userful application to find credit card details such as Card type, Country Issue Bank etc using BIN number(first 6 digit of card)\n" +
                    "This tool is used to Verify Credit Cards using Lubin's algorithm, also known as the modulus 10 or modi 10 algorithm.\n");
            binding.tv3.setText("✤ We do not represent any financial institution or bank!");
        }
        if(pos==9)
        {
            binding.textView18.setText("Home");

            binding.tv1.setText("✤ Unlimited Access: You can check your CIBIL Score &amp; Report every 24 hours within your subscription period (1 month, 6 months, 12 months) 1010 Here is what members get: Unlimited Access Loan Offers Credit, Monitoring, Dispute Resolution and more.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==10)
        {
            binding.textView18.setText("Buy");

            binding.tv1.setText("✤ Introducing Score Simulator with your CIBIL Score subscription. Monitoring &amp; maintaining your credit health now becomes easier. 1010 Subscription Plan :- 10 Premium ₹1200(1 Year) 10 Standard ₹800(6 Month) 10 Basic ₹550(1 Month)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==11)
        {
            binding.textView18.setText("Company");

            binding.tv1.setText("✤ Introducing CIBIL RANK with your Company Credit Report at no additional cost. 1010 The CIBIL RANK and Company Credit Report is an indication of your loan eligibility.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==12)
        {
            binding.textView18.setText("Credit score");

            binding.tv1.setText("✤ Calculate or Estimate your CIBIL Score for Free. 10 Great! Now that you are here, you would be keen to check your online Cibil score free of cost. 1010 We have been helping friends like you get a free Cibil score with an accuracy of up to 93%.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==13)
        {
            binding.textView18.setText("Media");

            binding.tv1.setText("✤ India Ratings and Research (Ind-Ra) is India&amp;s most respected credit rating agency committed to providing India&amp;s credit markets accurate, timely and prospective credit opinions");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==14)
        {
            binding.textView18.setText("Dispute");

            binding.tv1.setText("✤ Looking for loans for your CIBIL Score? 10 Our Eligibility 10 • Cibil Score above 550 10 • Loans ranging from ₹120,000 to ₹150,000 10 • Tenure between 3 months to 12 months 10 • Interest Rate between 1.5% to 2.5% per month (flat)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==15)
        {
            binding.textView18.setText("credit mantri");

            binding.tv1.setText("✤ Check your FREE Credit Score and report Instantly. 10 How It Works 10 • Get a Credit Score for Free from CreditMantri. 10 • Flag off problem areas where you need expertise/help. 10 • Improve your Credit Score and Build Your Credit profile. 10 • Reduce EMI and borrowing costs and more.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }


        if(pos==16)
        {
            binding.textView18.setText("Health insurance");

            binding.tv1.setText("✤ Health insurance refers to a type of general insurance, which provides financial assistance to policyholders when they are admitted to hospitals for treatment. Additionally, some plans also cover the cost of treatment undertaken at home, prior to a hospitalization or after discharge from the same. \n\n✤ With the rising medical inflation in India, buying health insurance has become a necessity. However, before proceeding with your purchase, consider the various types of health insurance plans available in India. \n\n✤ Types of Health Insurance policies \n\n✤ There are eight main types of health insurance policies available in India. They are: \n\n✤ Individual Health Insurance - These are healthcare plans that offer medical cover to just one policyholder.\n\n✤ Family Floater Insurance - These policies allow you to avail health insurance for your entire family without needing to buy separate plans for each member. Generally, husband, wife and two of their children are allowed health cover under one such family floater policy.\n\n✤ Critical Illness Cover - These are specialized health plans that provide extensive financial assistance when the policyholder is diagnosed with specific, chronic illnesses. These plans provide a lump-sum payout after such a diagnosis, unlike typical health insurance policies. \n\n✤ Senior Citizen Health Insurance - As the name suggests, these policies specifically cater to individuals aged 60 years and beyond.\n\n✤ Group Health Insurance - Such policies are generally offered to employees of an organization or company. They are designed in such a way that older beneficiaries can be removed, and fresh beneficiaries can be added, as per the company’s employee retention capability.\n\n✤ Maternity Health Insurance - These policies cover medical expenses during prenatal, post-natal and delivery stages. It covers both the mother as well as her newborn. \n\n✤ Personal Accident Insurance - These medical insurance policies only cover financial liability from injuries, disability or death arising due to accidents.\n\n✤ Preventive Healthcare Plan - Such policies cover the cost of treatment concerned with preventing a severe disease or condition. \n\n✤ Benefits of Health Insurance \n✤ After assessing the various kinds of health insurance available, you must be wondering why availing such a plan is essential for you and your loved ones. Look at the reasons listed below to understand why. \n\n✤ Medical Cover - The primary benefit of such insurance is that it offers financial coverage against medical expenditure. \n\n✤ Cashless Claim - If you seek treatment at one of the hospitals that have tie-ups with your insurance provider, you can avail cashless claim benefit. This feature ensures that all medical bills are directly settled between your insurer and hospital. \n\n✤ Tax Benefits - Those who pay health insurance premiums can enjoy income tax benefits. Under Section 80D of the Income Tax Act one can avail a tax benefit of up to Rs.1 Lakh on the premium payment of their health insurance policies. \n\n✤ There may be additional advantages, depending on the insurance provider in question.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==17)
        {
            binding.textView18.setText("Bike Insurance");

            binding.tv1.setText("✤ Motor insurance refers to policies that offer financial assistance in the event of accidents involving your car or bike. Motor insurance can be availed for three categories of motorized vehicles, including: \n\n✤ Car Insurance - Personally owned four-wheeler vehicles are covered under such a policy. \n\n✤ Two-wheeler Insurance - Personally owned two-wheeler vehicles, including bikes and scooters, are covered under these plans. \n\n✤ Commercial Vehicle Insurance - If you own a vehicle that is used commercially, you need to avail insurance for the same. These policies ensure that your business automobiles stay in the best of shapes, reducing losses significantly. \n\n✤ Types of Motor Insurance Policies\n\n✤ Based on the extent of cover or protection offered, motor insurance policies are of three types, namely: \n\n✤ Third-Party Liability - This is the most basic type of motor insurance cover in India. It is the minimum mandatory requirement for all motorized vehicle owners, as per the Motor Vehicles Act of 1988. Due to the limited financial assistance, premiums for such policies also tend to be low. These insurance plans only pay the financial liability to the third-party affected in the said mishap, ensuring that you do not face legal hassle due to the accident. They, however, do not offer any financial assistance to repair the policyholder’s vehicle after accidents. \n\n✤ Comprehensive Cover - Compared to the third-party liability option, comprehensive insurance plans offer better protection and security. Apart from covering third party liabilities, these plans also cover the expenses incurred for repairing the damages to the policyholder’s own vehicle due to an accident. Additionally, comprehensive plans also offer a payout in case your vehicle sustains damage due to fire, man-made and natural calamities, riots and other such instances. Lastly, you can recover your bike’s cost if it gets stolen, when you have a comprehensive cover in place. One can also opt for several add-ons with their comprehensive motor insurance policy that can make it better-rounded. Some of these add-ons include zero depreciation cover, engine and gear-box protection cover, consumable cover, breakdown assistance, etc.\n\n✤ Own Damage Cover - This is a specialized form of motor insurance, which insurance companies offer to consumers. Further, you are eligible to avail such a plan only if you purchased the two-wheeler or car after September 2018. The vehicle must be brand new and not a second-hand one. You should also remember that you can avail this standalone damage cover only if you already have a third party liability motor insurance policy in place. With its own damage cover, you basically receive the same benefits as a comprehensive policy without the third-party liability portion of the policy. \n\n✤ Benefits of Motor Insurance Policies \n\n✤ Cars and bikes are increasingly more expensive with each passing day. At such a time, staying without proper insurance can lead to severe monetary losses for the owner. Listed below are some advantages of purchasing such a plan. \n\n✤ Prevents Legal Hassle - Helps you avoid any traffic fines and other legalities that you would otherwise need to bear.\n\n✤ Meets All Third-Party Liability - If you injure a person or damage someone’s property during a vehicular accident, the insurance policy helps you meet the monetary losses, effectively. \n\n✤ Financial Assistance to Repair Your own Vehicle - After accidents, you need to spend considerable sums on repairing your own vehicle. Insurance plans limit such out of pocket expenses, allowing you to undertake repairs immediately.\n\n✤ Theft/loss cover - If your vehicle is stolen, your insurance policy will help you reclaim a portion of the car/bike’s on-road price. You can expect similar assistance if your vehicle is damaged beyond repair due to accidents. \n\n✤ Additionally, individuals who own a commercial car/two-wheeler can also avail tax benefits if they pay premiums for that vehicle.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==18)
        {
            binding.textView18.setText("Home Insurance");

            binding.tv1.setText("✤ As the name suggests, a home insurance policy offers comprehensive protection to the contents and structure of your house against any physical destruction or damage. In other words, this insurance type will provide coverage against any natural and human-made calamity, such as fire, earthquake, tornado, burglaries, and robbery. \n\n✤ Different types of home insurance policies include: \n\n✤ Home Structure/Building Insurance – Protects the structure of the house against damage during any calamity \n\n✤ Public Liability Coverage – Provides coverage against any damage to a guest or third-party on the insured residential property \n\n✤ Standard Fire and Special Perils Policy – Coverage against damages caused due to fire outbreaks, natural calamities (e.g., landslides, rockslides, earthquakes, storms, and floods), and anti-social human-made activities (e.g., explosions, strikes, and riots) \n\n✤ Personal Accident – Provides financial coverage to you and your family against any kind of permanent dismemberment or sudden demise to the insured individual, anywhere around the world \n\n✤ Burglary and Theft Insurance – Provides compensation for stolen goods in case of a burglary or theft \n\n✤ Contents Insurance – Provides compensation for loss of furniture, vehicles, and other appliances in case of a fire, theft, flood, or riots\n\n✤ Tenants’ Insurance – Provides financial protection to you (as a tenant) against any loss of personal property living in a rented house \n\n✤ Landlords’ insurance – Provides coverage to you (as a landlord) against contingencies such as public liability and loss of rent");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==19)
        {
            binding.textView18.setText("Travel Insurance");

            binding.tv1.setText("✤ When talking about the different types of insurance policies, one must not forget to learn more about travel insurance plans. Such policies ensure the financial safety of a traveler during a trip. Therefore, when compared to other insurance policies, travel insurance is a short-term cover. \n\n✤ Depending on the provider you choose, travel insurance may offer financial aid at various times, such as during loss of baggage, trip cancellation and much more. Here is a look at some of the different types of travel insurance plans available in the country: \n\n✤ Domestic Travel Insurance - This is the kind of travel insurance policy that safeguards your finances during travels within India. However, if you plan to step outside the country for a vacation, such a policy would not offer any aid. \n\n✤ International Travel Insurance - If you are stepping out of the country, ensure you pick an international travel insurance plan. It allows you to cover the unforeseen expenses that can arise during your trip like medical emergencies, baggage loss, loss of passport, etc. \n\n✤ Home Holiday Insurance - When you are traveling with family, your home remains unguarded and unprotected. Chances of burglary are always significant, which may lead to significant losses. Thankfully, with home holiday insurance plans, which are often included within travel policies, you are financially protected from such events as well. \n\n✤ Benefits of Travel Insurance \n\n✤ The following aspects are covered under travel insurance plans: \n\n✤ Cover Flight Delay - Flight delays or cancellations can lead to significant losses for the passenger. If you buy travel insurance, you can claim such financial losses from the insurer. \n\n✤ Baggage Loss/Delay - Travel insurance lets you claim monetary assistance if there is a delay or you happen to lose your luggage during the trip. With this amount, you can purchase some of the necessary items. \n\n✤ Reclaim Lost Travel Documents - Visa and passport are essential documents during an international trip. Opting for international travel insurance ensures that you have the necessary financial backing to reapply for interim or replacement documents as and when necessary. \n\n✤ Trip Cancellation Cover - A sudden death in the family or a medical emergency may play spoilsport with your travel arrangements. Thankfully, international travel insurance plans support trip cancellations in such events. You can claim financial assistance to pay penalties and cancellation charges for flights, hotels, etc. \n\n✤ Make sure that you choose an insurer carefully, especially a company that is reliable and available 24x7 to assist you.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==20)
        {
            binding.textView18.setText("Property Insurance");

            binding.tv1.setText("✤ Any building or immovable structure can be insured through property insurance plans. This can be either your residence or commercial space. If any damage befalls such a property, you can claim financial assistance from the insurance provider. Keep in mind that such a plan also financially safeguards the content inside the property. \n\n✤ Types of Property Insurance in India \n\n✤ Here are some types of property insurance policies available in India: \n\n✤ Home Insurance - With such a policy, you remain free from all financial liabilities that may arise from damage to your home or contents inside due to fires, burglaries, storms, earthquakes, explosions and other events. \n\n✤ Shop Insurance - If you own a shop, which acts as a source of income for you, it is integral to protect yourself from financial liability arising from the same. Whether the liability occurs due to natural calamities or due to accidents, with these plans, you can immediately undertake repairs to the shop. \n\n✤ Office Insurance - Another type of property insurance policy, office insurance ensures that the office building and all the equipment inside are significantly protected in the event of unforeseen events. Generally, office spaces include expensive equipment, such as computers, servers and much more. Thus, availing these plans is essential. \n\n✤ Building Insurance - If you own a complete building, opting for home insurance may not be sufficient. Instead, you can purchase building insurance to cover the entire premises. \n\n✤ Benefits of Property Insurance \n\n✤ If you still think that property cover is not one of the types of insurance plans you need to avail, take a look at some of the advantages from the same. \n\n✤ Protection against Fires - While the insurance policy cannot prevent fires, it can prevent financial liabilities from such an event. \n\n✤ Burglaries - If your property exists in an area prone to theft and burglaries, such a policy is vital to ensure financial security. \n\n✤ Floods - In certain parts of India, floods are common. These floods can ravage your property leading to substantial losses. Property insurance also protects against such events. \n\n✤ Natural Calamities - The plan also offers financial aid against damage arising from earthquakes, storms and more. \n\n✤ Rebuilding or renovation of a property is immensely expensive. Thus, property insurance policies are the best option to ensure long-term financial health.+");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==21)
        {
            binding.textView18.setText("Term Life Insurance");

            binding.tv1.setText("✤ Term insurance is the purest and most affordable among the types of insurance policy in which you can opt for a high life cover for a specific period. You can secure your family’s financial future with a term life insurance plan by paying a low premium (term insurance plans generally do not have any maturity value, and thus, offer lower rates of premium than other life insurance products.) \n\n✤ If anything happens to you within the policy period, your loved ones would receive the agreed Sum Assured as per the payout option chosen (some term insurance types offer multiple payout options as well)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==22)
        {
            binding.textView18.setText("Whole Life Insurance");

            binding.tv1.setText("✤ Whole life insurance plans, also known as ‘traditional’ life insurance plans, provide coverage for the entire life of the insured individual, as opposed to any other life insurance instrument that offers coverage for a specific number of years. \n\n✤ While a whole life insurance plan offers to pay a death benefit, the plan also contains a savings component, which helps accrue a cash value throughout the policy term. The maturity age for a whole life insurance policy is 100 years. In case, the insured individual lives past the maturity age, the whole life plan will become a matured endowment.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==23)
        {
            binding.textView18.setText("Endowment Plans");

            binding.tv1.setText("✤ Endowment plans essentially provide financial coverage to the policyholder against life’s uncertainties, while allowing them to save regularly over a certain period. Upon maturity of the endowment plan, the policyholder receives a lump sum amount if he or she survives the policy term. \n\n✤ If anything happens to you (as Life Insured), the life insurance endowment policy pays the complete Sum Assured to your family (beneficiaries)");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==24)
        {
            binding.textView18.setText("Unit Linked Insurance");

            binding.tv1.setText("✤ Unit Linked Insurance Plans are types of insurance policy that offer both investment and insurance benefits under a single policy contract. A portion of the premium that you pay towards a Unit Linked Insurance Plan is allocated to a variety of market-linked equity and debt instruments. \n\n✤ The remaining premium contributes towards providing the life cover throughout the policy tenure. In this investment-cum-insurance type product, you have the flexibility to choose the allocation of premium into different instruments as per your financial requirements and market risk appetite.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==25)
        {
            binding.textView18.setText("Child Plans");

            binding.tv1.setText("✤ Child plans are types of insurance policies that help you financially secure your child’s life goals such as higher education and marriage, even in your absence. In other words, child plans offer a combination of savings and insurance benefits that aid you in the financial planning for your child’s future needs at the right age. \n\n✤ The sum of money received on Maturity under this insurance type can be used to fulfill the financial requirements of your child.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==26)
        {
            binding.textView18.setText("Pension Plans");

            binding.tv1.setText("✤ Pension plan, also known as retirement plan, is a type of investment plan that aids you in accumulating a portion of your savings over an extended period. \n\n✤ Essentially, a pension plan helps you deal with financial uncertainties post-retirement, by ensuring that you continue to receive a steady flow of income even after your working years are over. \n\n✤ In other words, a pension plan can be a type of insurance in India that allows you to create a financial cushion for your life post-retirement, in which you contribute a specific amount of money regularly until your retirement. Subsequently, the accumulated amount is given back to you as annuity or pension at regular intervals. \n\n✤ With Max Life Insurance, you can find comprehensive plans such as Max Life Smart Wealth Plan or Max Life Smart Secure Plus Plan to fulfill your particular investment goals and keep your loved ones financially secure.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==27)
        {
            binding.textView18.setText("Fire Insurance");

            binding.tv1.setText("✤ Fire insurance policies are different types of insurance coverages that compensate any losses incurred due to a fire breakout with a sum assured. These types of insurance policy usually provide a significant amount of coverage to help both individuals and companies to reopen their places after incurring extensive damage due to fire. These insurance types cover war risk, turmoil, riots losses as well. \n\n✤ Different types of fire insurance in India are – \n\n✤ Valued policy \n\n✤ Specific Policy \n\n✤ Floating Policy \n\n✤ Consequential Policy \n\n✤ Replacement Policy \n\n✤ Comprehensive Fire insurance policy");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }

        if(pos==28)
        {
            binding.textView18.setText("EPF Service");

            binding.tv1.setText("✤ An Employee Provident Fund is an initiative designed to offer social security benefits to employees of a particular organization, building stronger employee - employer bonds. \n\n✤ In order to enjoy these benefits to the hilt, employers need to follow a set of rules and guidelines laid out, with registration forming the first step. + Employers need to provide the following details to successfully register themselves . \n\n✤ Name and address of company → Head office and branch details → Mention date of incorporation/ registration of company Fill up details of employees - total employee strength → Activity the business / enterprise is involved in - ie manufacturing, production, service , etc. \n\n✤ Legal details - This pertains to legal status of a company, ie whether it is a https://registration. shramsuvidha.gov.in/ user/login \n\n✤ Owner details , including designation and address of Directors and partners \n\n✤ Particulars related to wage component of employees , ie total wage disbursed during a month \n\n✤ Details of bank with whom company has banking relationship → PAN details → Basic details of employ + Documents required for EPF Registration Online :- Copy of partnership deed if the company is a registered partnership firm - A copy of the Certificate of incorporation for a Public or Private Limited Company. This should be issued by the Registrar of Companies \n\n✤ KYC U→ Societies should furnish a copy of their registration certificate → Public and Private Limited Companies need to submit a copy of memorandum and Articles of Association");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==29)
        {
            binding.textView18.setText("KYC Updating");

            binding.tv1.setText("✤ To upload the KYC document on the EPF UAN , follow the steps mentioned below : \n\n✤ Visit the EPFOS member portal http:// vanmembers.epfoservices.in/ Once the page is displayed on your screen, click on profile on the top bar. From the drop down list, click on upload KYC document. \n\n✤ Once you have clicked on that , select the KYC information you wish to update. Next, you will have to upload a scanned self attested copy of the KYC document.\n\n✤ The document should be either in jpg, pdf or png format , and keep in mind that the maximum file size of your KYC document does not exceed 300 KB. Once you have uploaded the document, the status of your KYC document will show as pending. \n\n✤ Only once your employer has verified the document and approved of it, the status will show as approved by employer. Once your employer has approved your document, you will receive an SMS confirming the same. From then on, the verification process when you make a claim will be much faster and you can expect an approval in no time. \n\n✤ Process of embedding KYC details in EPF UAN : ce your employer has verified");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==30)
        {
            binding.textView18.setText("UMANG");

            binding.tv1.setText("✤ Unified Mobile Application for New - age Governance (UMANG ) app was launched in November 2017 as a means of creating a common portal for all the facilities offered by the government . \n\n✤ Additionally, other government developed programs such as the Aadhaar and Digilocker are integrated with the app. Umang offers over 180 government services to its users. \n\n✤ One of these is the services offered by the EPFO. The EPF service on the UMANG app allows users to access information about their EPF account. This service is extended to both employers and employees. \n\n✤ Though the EPFO tab on the UMANG app, employees can file claims for EPF withdrawal as well as track the status of their claims. \n\n✤ Some of the requirements for using this facility is having your Aadhaar linked to the app, as well as an active UAN. \n\n✤ UMANG service has been made available on multiple channels like mobile application, web, IVR and SMS which can be accessed through smartphones , feature phones , tablets and desktops.\n\n✤ UMANG has been created with a thought to add convenience to your lifestyle. UMANG will revolutionize the way how an Indian citizen avails government services today, because it leverages the current accelerated internet and smartphone penetration in our country.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==31)
        {
            binding.textView18.setText("ECR/Returns and Payment");

            binding.tv1.setText("✤ Step 1: Login to EPFO portal using your ECR portal credentials : Once logged in you can check the details of Establishment Name, Establishment ID , Exemption Status ( PF, Pension , EDLI), Establishment Address and PF office . \n\n✤ Step 2: To upload ECR, go to Payments tab &gt;&gt; ECR ( UPLOAD] \n\n✤ Step 3: On next screen, ie ECR File Upload , click on ECR Help File to view the ECR file format To upload the ECR, select the Wage Month and Salary Disbursal Date. \n\n✤ Step 4: Select your ECR text file to be uploaded. An ECR text file appears like the one below : \n\n✤ Step 5: Select the remaining fields like File Type ( Select ECR), Contribution Rate % ( Default value is 12 % ), add comment, and click on Upload Button : \n\n✤ Step 6: Once uploaded, the file will be validated by the portal against the pre - defined conditions. Once validation is successful, you can see the following screen with Validation Successful message : Click Verify button generate TRRN ( Temporary Return Reference Number ). \n\n✤ Step 7: Generate ECR summary sheet by clicking on Prepare Challan");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==32)
        {
            binding.textView18.setText("Online Claims account transfer");

            binding.tv1.setText("✤ We bring you steps that you must follow while applying for online EPF transfer.\n\n✤ Step 1: Go to the EPFO website, epfindia.com. \n\n✤ Step 2: The home page will show a section called online transfer claim portal. Click on it. \n\n✤ Step 3: Before logging in, check if you can apply online. If not, you will have to submit a physical copy of Form 13 to either your present or your previous employer. \n\n✤ Step 4: After checking the eligibility , log in and go to the claims section. There, click on request for transfer of funds. \n\n✤ Step 5: Form 13 will open. Fill your PF numbers with both previous and current employers and click on click here to get details. The name and address of the establishment, the PF account held by the EPFO and your name will appear on the screen. \n\n✤ Step 6: Your date of joining, date of leaving and father / spouses name also appear. This is to make sure that the money is transferred to the right account. \n\n✤ Step 7: You will be asked if you want to get the claim attested through your previous employer or your present employer \n\n✤ Step 8: You will have to type the characters shown in the text box and click on Get Pin. You will then have to agree to the declaration in the form by clicking on I Agree. \n\n✤ Step 9: Enter the PIN received on the registered mobile . The application is submitted . \n\n✤ Step 10: Tracking ID is generated. \n\n✤ Step 11: The form will be saved in the system. You have to take a printout of its PDF version, sign it and submit it to the employer within 15 days. \n\n✤ Step 12: Note down the contact details of people authorized to sign on the form. These are shown after the form is submitted. \n\n✤ Step 13: Present and previous employers will verify your details electronically. \n\n✤ Step 14: Once approval comes from both employers, funds are credited to the members account by the EPFO branch office. \n\n✤ Step 15: The employer plays an important role in this process by verifying the authenticity and signature of the employee. The EPFO keeps you updated through SMSes. You can also track the application through the EPFO website.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==33)
        {
            binding.textView18.setText("E-Passport");

            binding.tv1.setText("✤ To avail the e - Passbook facility , you will have to compulsorily register on the EPFO official website. The following details will have to be filled in while registering : \n\n✤ Your mobile number\n\n✤ PAN number \n\n✤ Aadhar Card number \n\n✤ National Population Register number \n\n✤ Bank account number &gt; Voter ID Driving license \n\n✤ Passport number → Ration Card number Your name as on the official documents \n\n✤ Email ID - &gt; You will get a captcha image, which you must type in the box provided and you will get the PIN \n\n✤ The PIN will be received on your registered mobile number via SMS. After you submit the form , you will get a confirmation on your registered mobile and it completes the registration process. \n\n✤ You can then login to the EPFO Member Portal and check your EPF status online. \n\n✤ The following is the process to generate your EPF e - Passbook : \n\n✤ Once you have logged in to the member portal , you will get a screen that you can alter your details and also download e - Passbook from this page . \n\n✤ When you select download, you will be asked to select the state and you will have to select the PF office of that state. \n\n✤ If you have no idea which is your PF office, you can find the details at http://epf-india.co.in/. - You can then enter the EPF account number and your name that is the same as in your EPFO records. \n\n✤ Fill in the captcha details and avail the PIN number. - Enter the pin number that you receive on your registered mobile number via SMS. Finally hit the button \n\n✤ Get Detail. You can then download the PDF e - Passbook. Remember the following while downloading EPF e- Passbook : Only one mobile number can be used for one registration. \n\n✤ You can however edit the mobile number later on. You can see only one EPF account under one establishment. \n\n✤ You can transfer old EPF account to the new one. → You will not be able to see settled or inoperative accounts.\n\n✤ You can register using different ID proofs and mobile number to check the details of the different accounts. Your EPF e - Passbook will contain the month and date wise transactions made in your account from the year in which the annual accounts were updated for the establishment.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==34)
        {
            binding.textView18.setText("Sharam Suvidha Common ECP");

            binding.tv1.setText("✤ In order to link an establishment with your account you need to be registered at USSP, follow below \n\n✤ Steps :→ To get started using the Shram Suvidha Portal right away, just type the following address into your web browser or click on the link below . \n\n✤ https://shramsuvidha.gov.in Search establishment LIN to link an establishment: Check establishment LIN through know your LIN option at portal main page menu. \n\n✤ If you find establishment LIN here, login to your Shram Suvidha account at portal home page. Below screen will be displayed, here enter login details : \n\n✤ 1. user id \n\n✤ 2. password \n\n✤ 3. verification code Click on the submit button to view the landing page.\n\n✤ After login, you will see a menu at left hand side. Choose Link Establishment option from menu .\n\n✤ Now you will see link establishment form, fill out LIN number, previous representative contact details ( registered mobile number and registered email id). \n\n✤ mobile / email of previous representative, fill LIN number and choose generate authorization letter option. Meet your regional head with generated letter.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==35)
        {
            binding.textView18.setText("Personal Portal");

            binding.tv1.setText("✤ Procedure for Generating Jeevan Pramaan / Digital Life Certificate : o Pre Requisites for Digital Life Certificate Generation The pensioner must have an Aadhaar number \n\n✤ The pensioner must have an existing mobile number \n\n✤ Registration of the Aadhaar number with Pension Disbursing Agency ( bank Post Office etc ) should have been done already Biometric device list of supported devices is given on the JP portal ) PC with Windows 7.0 &amp; above Android Mobile / Tablet 4.0 &amp; above oso Internet Connectivity");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==36)
        {
            binding.textView18.setText("International Worker Portal");

            binding.tv1.setText("✤ What is a Coc ? Employees who are going on an assignment to a country with which India has an operational Social Security Agreement are exempted from contributing towards social security schemes in the other country ( host country ) if a Cac has been obtained from the EPFO. \n\n✤ Stops under the new online process : \n\n✤ EPFO has issued a user manval detailing the steps to be followed by the employee and the employer to apply for a Cocas per the new online process. \n\n✤ Here is the step by step process for applying for a Coc. For employee: \n\n✤ 1. Visit the international workers portal on the EPFO website : https :// iwu.cpfindia.gov.in/iwu/ and select APPLICATION FOR COC. \n\n✤ 2. Mention Universal Account Number ( WAN ) and select appropriate member ID. \n\n✤ 3. Complete and submit the application. A reference number of the application will be generated upon submission and the pre - filled application will be available for download and print. \n\n✤ 4. Download and print the application. Sign the application and upload it along with a copy of anes passport. + To upload the signed application, visit the international workers portal and select UPLOAD SIGNED APPLICATION FOR COC. The employee con download the pre - Filled application from here as well. + For employer : Once the employee has uploaded the signed application , the employer needs to follow these steps : \n\n✤ 1. Visit the international workers portal and login using the same login credential used for the Unified Portal (Employer ). \n\n✤ 2. Select Certificate of Coverage from the tab Application.\n\n✤ 3. Select the appropriate Reference Number to get the signed application uploaded by the employee, verify all the details and approve / reject the application accordingly. \n\n✤ 4. Once the application is approved, download the application signed by the employee. To download, select Signed applications Members under the tab Downloads.\n\n✤ 5. Take a print of the downloaded application and sign with date and stamp at the appropriate place. \n\n✤ 6. Upload the duly signed and stamped application. To upload, select Signed applications - Employer under the tab Upload. - &gt; Once the signed copy of the application is uploaded, the relevant PF office will process the application and generate the CoC accordingly,\n\n✤ Both employee and employer can track the status of the application from the international workers portal by selecting TRACK APPLICATION FOR COC and providing application reference number and date of birth of the employee.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }
        if(pos==37)
        {
            binding.textView18.setText("EKYC Portal");

            binding.tv1.setText("✤ eKYC, often called paperless KYC, is the process of electronically verifying the customer’s credentials.\n\n✤ This is mandatory for everyone to avail of the services from any financial institution. \n\n✤ It is also called Aadhaar-based eKYC as your identity is verified electronically wherein the service provider can access the details of your Aadhaar from the Unique Identification Authority of India (UIDAI) database.\n\n✤ Thus, this provides your proof of identity and address to the service provider instantly, eliminating the need for tedious in-person verification.");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }

        if(pos==38)
        {
            binding.textView18.setText("Personal");

            binding.tv1.setText("");
            binding.tv2.setVisibility(View.GONE);
            binding.tv3.setVisibility(View.GONE);
        }

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