package com.withings.badge.detail;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_BadgeDetailActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f32739a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f32740b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f32741c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f32742d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_BadgeDetailActivity() {
        addOnContextAvailableListener(new o(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f32740b == null) {
            synchronized (this.f32741c) {
                try {
                    if (this.f32740b == null) {
                        this.f32740b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f32740b;
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
        if (!this.f32742d) {
            this.f32742d = true;
            BadgeDetailActivity badgeDetailActivity = (BadgeDetailActivity) this;
            ((g) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f32739a = b10;
            if (b10.b()) {
                this.f32739a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f32739a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
