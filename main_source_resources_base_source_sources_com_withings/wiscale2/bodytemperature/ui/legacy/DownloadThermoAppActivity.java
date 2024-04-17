package com.withings.wiscale2.bodytemperature.ui.legacy;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import by.kirich1409.viewbindingdelegate.b;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.button.MaterialButton;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.h;
import u70.e;
import ym0.l;
/* compiled from: DownloadThermoAppActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/bodytemperature/ui/legacy/DownloadThermoAppActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DownloadThermoAppActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f50301b = {v.c(DownloadThermoAppActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityDownloadThermoBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final f f50302a;

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class a extends w implements l<ComponentActivity, h> {
        @Override // ym0.l
        public final h invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            u.i(e11, "requireViewById(this, id)");
            return h.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public DownloadThermoAppActivity() {
        super(C1987R.layout.activity_download_thermo);
        this.f50302a = b.a(this, u9.a.a(), new w(1));
    }

    private final h z3() {
        Object value = ((LifecycleViewBindingProperty) this.f50302a).getValue(this, f50301b[0]);
        u.i(value, "getValue(...)");
        return (h) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i11;
        super.onCreate(bundle);
        h z32 = z3();
        z32.f99126b.setTitleTextColor(ah.u.w(16842808, this, -65281));
        setSupportActionBar(z3().f99126b);
        ActionBar supportActionBar = getSupportActionBar();
        boolean z5 = true;
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        if (getPackageManager().getLaunchIntentForPackage(getString(C1987R.string.thermo_appPackage)) == null) {
            z5 = false;
        }
        h z33 = z3();
        if (z5) {
            i11 = C1987R.string._THERMO_OPEN_ACTION_;
        } else {
            i11 = C1987R.string._THERMO_APP_ACTION_;
        }
        MaterialButton materialButton = z33.f99125a;
        materialButton.setText(i11);
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.bodytemperature.ui.legacy.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k<Object>[] kVarArr = DownloadThermoAppActivity.f50301b;
                DownloadThermoAppActivity this$0 = DownloadThermoAppActivity.this;
                u.j(this$0, "this$0");
                e.d(this$0, C1987R.string.thermo_appPackage);
            }
        });
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
