package com.withings.wiscale2.activity;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public abstract class Hilt_ActivityActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f48250a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f48251b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f48252c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48253d;

    Hilt_ActivityActivity() {
        this.f48252c = new Object();
        this.f48253d = false;
        addOnContextAvailableListener(new i(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f48251b == null) {
            synchronized (this.f48252c) {
                try {
                    if (this.f48251b == null) {
                        this.f48251b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f48251b;
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
        if (!this.f48253d) {
            this.f48253d = true;
            ((e) generatedComponent()).v0((ActivityActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f48250a = b10;
            if (b10.b()) {
                this.f48250a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f48250a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ActivityActivity(int i11) {
        super(C1987R.layout.activity_activity);
        this.f48252c = new Object();
        this.f48253d = false;
        addOnContextAvailableListener(new i(this));
    }
}
