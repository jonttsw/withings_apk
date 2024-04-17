package com.withings.wiscale2.device.wpm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.withings.android.activity.WithingsActivity;
import com.withings.common.device.util.DeviceModelScanningAbilityProvider;
import com.withings.device.Device;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public class Wpm0203StartMeasureActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f55678b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f55679a = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 4));

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wpm0203_start_measure);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        getSupportActionBar().o(true);
        Device device = (Device) getIntent().getSerializableExtra("device");
        ((TextView) findViewById(C1987R.id.setup_message)).setText(we0.n.a(device.getModelId()).f37556e);
        ((ImageView) findViewById(C1987R.id.image)).setImageResource(we0.m.a(device.getModelId()).f37547b);
        if (!new aq.a(this).e()) {
            DeviceModelScanningAbilityProvider deviceModelScanningAbilityProvider = new DeviceModelScanningAbilityProvider(device.getModelId());
            Intent intent = new Intent(this, EnablePermissionsForScanActivity.class);
            intent.putExtra("extra_scanning_ability_provider", deviceModelScanningAbilityProvider);
            this.f55679a.a(intent);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
