package com.withings.ecg.heartsound;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public abstract class Hilt_HeartSoundListActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f38413a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f38414b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f38415c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38416d;

    Hilt_HeartSoundListActivity() {
        this.f38415c = new Object();
        this.f38416d = false;
        addOnContextAvailableListener(new w0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f38414b == null) {
            synchronized (this.f38415c) {
                try {
                    if (this.f38414b == null) {
                        this.f38414b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f38414b;
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
        if (!this.f38416d) {
            this.f38416d = true;
            HeartSoundListActivity heartSoundListActivity = (HeartSoundListActivity) this;
            ((o0) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f38413a = b10;
            if (b10.b()) {
                this.f38413a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f38413a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_HeartSoundListActivity(int i11) {
        super(C1987R.layout.activity_measurement_pager);
        this.f38415c = new Object();
        this.f38416d = false;
        addOnContextAvailableListener(new w0(this));
    }
}
