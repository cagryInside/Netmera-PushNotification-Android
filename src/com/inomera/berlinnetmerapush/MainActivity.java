package com.inomera.berlinnetmerapush;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.netmera.mobile.NetmeraClient;
import com.netmera.mobile.NetmeraPushService;

public class MainActivity extends Activity {

	private static final String NETMERA_API_KEY = "WVhCd1ZYSnNQV2gwZEhBbE0wRWxNa1lsTWtZME5qYzRORE0xTkM1dVpYUnRaWEpoTG1OdmJTVXpRVGd3SlRKR2JXOWlhVzFsY21FbE1rWm5ZV1JuWlhRbE1rWm9iMjFsTG5odGJDWnViVk5wZEdWVmNtdzlhSFIwY0NVelFTVXlSaVV5UmpRMk56ZzBNelUwTG01bGRHMWxjbUV1WTI5dEpUTkJPREFtYlc5a2RXeGxTV1E5T0RNeE9DWmhjSEJKWkQwME5qYzRORE0xTkNadWJWUmxiWEJzWVhSbFBXMXZZbWwwWlcxd2JHRjBaU1p2ZDI1bGNrbGtQV05oWjNKcFkyVjBhVzQ0T1Naa2IyMWhhVzQ5Ym1WMGJXVnlZUzVqYjIwbWJtMVRhWFJsUFRRMk56ZzBNelUwSm05M2JtVnlVbTlzWlZSNWNHVTlNU1oyYVdWM1pYSlNiMnhsVkhsd1pUMHhKblpwWlhkbGNrbGtQV05oWjNKcFkyVjBhVzQ0T1NZ";
	private static final String GOOGLE_API_KEY = "293360593631";
	//293360593631
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NetmeraClient.init(this, NETMERA_API_KEY); 
        NetmeraPushService.register(getApplicationContext(), MainActivity.class, GOOGLE_API_KEY);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
