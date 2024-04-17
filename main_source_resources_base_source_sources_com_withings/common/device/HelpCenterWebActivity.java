package com.withings.common.device;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.webview.WebActivity;
import com.withings.webview.WebFragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HelpCenterHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/common/device/HelpCenterWebActivity;", "Lcom/withings/webview/WebActivity;", "<init>", "()V", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HelpCenterWebActivity extends WebActivity {
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.helpcenter, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.withings.webview.WebActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_contact) {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            String string = getString(C1987R.string._HELP_CENTER_);
            String string2 = getString(C1987R.string.helpCenter_newRequestURL);
            u.i(string2, "getString(...)");
            startActivity(aVar.c(this, string, string2));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        WebFragment webFragment = this.webFragment;
        if (webFragment != null) {
            webFragment.M1();
        }
    }
}
