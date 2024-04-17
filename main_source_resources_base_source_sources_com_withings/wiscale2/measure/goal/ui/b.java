package com.withings.wiscale2.measure.goal.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Hilt_WeightGoalActivity.java */
/* loaded from: classes5.dex */
public abstract class b extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f58417a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f58418b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58419c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f58420d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        addOnContextAvailableListener(new a(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f58418b == null) {
            synchronized (this.f58419c) {
                try {
                    if (this.f58418b == null) {
                        this.f58418b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f58418b;
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
        if (!this.f58420d) {
            this.f58420d = true;
            ((i) generatedComponent()).w0((WeightGoalActivity) this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f58417a = b10;
            if (b10.b()) {
                this.f58417a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f58417a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
