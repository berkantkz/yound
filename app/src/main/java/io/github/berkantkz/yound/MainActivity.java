package io.github.berkantkz.yound;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {

    static String baseURL = "https://youtubemp3api.com/@api/button/mp3/", fullURL, receivedText;
    Intent receivedIntent;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mInterstitialAd = new InterstitialAd(MainActivity.this);
        // set the ad unit ID
        mInterstitialAd.setAdUnitId("ca-app-pub-2951689275458403/1353648779");

        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mInterstitialAd.loadAd(adRequest);

        receivedIntent = getIntent();
        receivedText = receivedIntent.getStringExtra(Intent.EXTRA_TEXT);
        fullURL = baseURL + receivedText.replace("https://","").replace("http://","").replace("youtu.be/","").replace("youtube.com/watch?v=","").replace("m.watch?v=","");
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(fullURL));
        startActivity(i);
        Toast.makeText(this, "berkantkz", Toast.LENGTH_SHORT).show();
        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                mInterstitialAd.show();
            }
            public void onAdClosed() {
                finish();
            }
        });
    }
}
