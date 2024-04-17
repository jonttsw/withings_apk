package com.withings.wiscale2.settings;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_UnitsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f59738a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f59739b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59740c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59741d;

    Hilt_UnitsActivity() {
        this.f59740c = new Object();
        this.f59741d = false;
        addOnContextAvailableListener(new i0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f59739b == null) {
            synchronized (this.f59740c) {
                try {
                    if (this.f59739b == null) {
                        this.f59739b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f59739b;
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void inject() {
        if (!this.f59741d) {
            this.f59741d = true;
            UnitsActivity unitsActivity = (UnitsActivity) this;
            ((h6) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f59738a = b10;
            if (b10.b()) {
                this.f59738a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f59738a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_UnitsActivity(int i11) {
        super(C1987R.layout.activity_units);
        this.f59740c = new Object();
        this.f59741d = false;
        addOnContextAvailableListener(new i0(this));
    }
}
