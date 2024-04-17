package com.withings.healthplus.completion.program.ui.activity;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import dagger.hilt.android.internal.managers.g;
/* loaded from: classes3.dex */
public abstract class Hilt_EndProgramActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private g f40039a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f40040b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f40041c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f40042d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_EndProgramActivity() {
        addOnContextAvailableListener(new f(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f40040b == null) {
            synchronized (this.f40041c) {
                try {
                    if (this.f40040b == null) {
                        this.f40040b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f40040b;
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
        if (!this.f40042d) {
            this.f40042d = true;
            EndProgramActivity endProgramActivity = (EndProgramActivity) this;
            ((e) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            g b10 = componentManager().b();
            this.f40039a = b10;
            if (b10.b()) {
                this.f40039a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f40039a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
