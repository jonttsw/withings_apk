package com.withings.wiscale2.partner.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_PartnerActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f58856a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f58857b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58858c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f58859d;

    Hilt_PartnerActivity() {
        this.f58858c = new Object();
        this.f58859d = false;
        addOnContextAvailableListener(new m(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f58857b == null) {
            synchronized (this.f58858c) {
                try {
                    if (this.f58857b == null) {
                        this.f58857b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f58857b;
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
        if (!this.f58859d) {
            this.f58859d = true;
            ((y) generatedComponent()).n0((PartnerActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f58856a = b10;
            if (b10.b()) {
                this.f58856a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f58856a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_PartnerActivity(int i11) {
        super(C1987R.layout.activity_partner);
        this.f58858c = new Object();
        this.f58859d = false;
        addOnContextAvailableListener(new m(this));
    }
}
