package com.withings.healthplus.explore.ui.activity;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_ExploreTabActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f40290a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f40291b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f40292c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f40293d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ExploreTabActivity() {
        addOnContextAvailableListener(new o0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f40291b == null) {
            synchronized (this.f40292c) {
                try {
                    if (this.f40291b == null) {
                        this.f40291b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f40291b;
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
        if (!this.f40293d) {
            this.f40293d = true;
            ((n0) generatedComponent()).g0((ExploreTabActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f40290a = b10;
            if (b10.b()) {
                this.f40290a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f40290a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
