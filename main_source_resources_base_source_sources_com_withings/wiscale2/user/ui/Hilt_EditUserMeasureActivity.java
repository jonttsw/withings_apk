package com.withings.wiscale2.user.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_EditUserMeasureActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f61817a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f61818b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f61819c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f61820d;

    Hilt_EditUserMeasureActivity() {
        this.f61819c = new Object();
        this.f61820d = false;
        addOnContextAvailableListener(new a0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f61818b == null) {
            synchronized (this.f61819c) {
                try {
                    if (this.f61818b == null) {
                        this.f61818b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f61818b;
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
        if (!this.f61820d) {
            this.f61820d = true;
            ((u) generatedComponent()).n((EditUserMeasureActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f61817a = b10;
            if (b10.b()) {
                this.f61817a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f61817a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_EditUserMeasureActivity(int i11) {
        super(C1987R.layout.activity_edit_user_measure);
        this.f61819c = new Object();
        this.f61820d = false;
        addOnContextAvailableListener(new a0(this));
    }
}
