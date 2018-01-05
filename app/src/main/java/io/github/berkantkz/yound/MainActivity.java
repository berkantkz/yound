package io.github.berkantkz.yound;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {

    static String baseURL = "https://youtubemp3api.com/@api/button/mp3/", fullURL, receivedText;
    Intent receivedIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        receivedIntent = getIntent();
        receivedText = receivedIntent.getStringExtra(Intent.EXTRA_TEXT);
        fullURL = baseURL + receivedText.replace("https://","").replace("http://","").replace("youtu.be/","").replace("youtube.com/","");
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(fullURL));
        startActivity(i);
        finish();
    }
}
