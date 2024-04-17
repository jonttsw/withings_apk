package com.withings.wiscale2.device.common.feature.activitygoal;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_SetFitnessAndStepsGoalActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f50893a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f50894b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f50895c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50896d;

    Hilt_SetFitnessAndStepsGoalActivity() {
        this.f50895c = new Object();
        this.f50896d = false;
        addOnContextAvailableListener(new v(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f50894b == null) {
            synchronized (this.f50895c) {
                try {
                    if (this.f50894b == null) {
                        this.f50894b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f50894b;
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
        if (!this.f50896d) {
            this.f50896d = true;
            ((a0) generatedComponent()).X0((SetFitnessAndStepsGoalActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f50893a = b10;
            if (b10.b()) {
                this.f50893a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f50893a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_SetFitnessAndStepsGoalActivity(int i11) {
        super(C1987R.layout.activity_fitness_and_step_goal);
        this.f50895c = new Object();
        this.f50896d = false;
        addOnContextAvailableListener(new v(this));
    }
}
