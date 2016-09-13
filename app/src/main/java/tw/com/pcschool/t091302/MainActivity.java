package tw.com.pcschool.t091302;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager nm;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

    }

    public void click1(View v)
    {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setSmallIcon(android.R.drawable.ic_menu_add)
                .setContentTitle("Title 1")
                .setContentText("This is content text")
                .setTicker("Ticket Title");
        Notification notification = builder.build();
        nm.notify(1, notification);
    }
}
