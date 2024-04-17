package com.withings.wiscale2.chat.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_ChatActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f50369a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f50370b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f50371c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f50372d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ChatActivity() {
        addOnContextAvailableListener(new j(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f50370b == null) {
            synchronized (this.f50371c) {
                try {
                    if (this.f50370b == null) {
                        this.f50370b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f50370b;
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
        if (!this.f50372d) {
            this.f50372d = true;
            ((e) generatedComponent()).k0((ChatActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f50369a = b10;
            if (b10.b()) {
                this.f50369a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f50369a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
