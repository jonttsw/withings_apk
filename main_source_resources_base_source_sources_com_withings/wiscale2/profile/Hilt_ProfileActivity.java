package com.withings.wiscale2.profile;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_ProfileActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f59260a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f59261b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59262c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59263d;

    Hilt_ProfileActivity() {
        this.f59262c = new Object();
        this.f59263d = false;
        addOnContextAvailableListener(new i(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f59261b == null) {
            synchronized (this.f59262c) {
                try {
                    if (this.f59261b == null) {
                        this.f59261b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f59261b;
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
        if (!this.f59263d) {
            this.f59263d = true;
            ProfileActivity profileActivity = (ProfileActivity) this;
            ((o) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f59260a = b10;
            if (b10.b()) {
                this.f59260a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f59260a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ProfileActivity(int i11) {
        super(C1987R.layout.activity_profile);
        this.f59262c = new Object();
        this.f59263d = false;
        addOnContextAvailableListener(new i(this));
    }
}
