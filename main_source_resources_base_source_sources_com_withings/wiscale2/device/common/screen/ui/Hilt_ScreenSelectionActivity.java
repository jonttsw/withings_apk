package com.withings.wiscale2.device.common.screen.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_ScreenSelectionActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f53120a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f53121b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f53122c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f53123d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ScreenSelectionActivity() {
        addOnContextAvailableListener(new b(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f53121b == null) {
            synchronized (this.f53122c) {
                try {
                    if (this.f53121b == null) {
                        this.f53121b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f53121b;
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
        if (!this.f53123d) {
            this.f53123d = true;
            ((x1) generatedComponent()).e0((ScreenSelectionActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f53120a = b10;
            if (b10.b()) {
                this.f53120a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f53120a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
