package com.withings.wiscale2.vascularage;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_VascularAgeActivityV1 extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f62187a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f62188b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f62189c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f62190d;

    Hilt_VascularAgeActivityV1() {
        this.f62189c = new Object();
        this.f62190d = false;
        addOnContextAvailableListener(new f(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f62188b == null) {
            synchronized (this.f62189c) {
                try {
                    if (this.f62188b == null) {
                        this.f62188b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f62188b;
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
        if (!this.f62190d) {
            this.f62190d = true;
            ((u) generatedComponent()).w((VascularAgeActivityV1) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f62187a = b10;
            if (b10.b()) {
                this.f62187a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f62187a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_VascularAgeActivityV1(int i11) {
        super(C1987R.layout.activity_vascular_age);
        this.f62189c = new Object();
        this.f62190d = false;
        addOnContextAvailableListener(new f(this));
    }
}
