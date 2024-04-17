package com.withings.wiscale2.activity.workout.ui.detail;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public abstract class Hilt_WorkoutListActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f49039a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f49040b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f49041c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f49042d;

    Hilt_WorkoutListActivity() {
        this.f49041c = new Object();
        this.f49042d = false;
        addOnContextAvailableListener(new b0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f49040b == null) {
            synchronized (this.f49041c) {
                try {
                    if (this.f49040b == null) {
                        this.f49040b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f49040b;
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
        if (!this.f49042d) {
            this.f49042d = true;
            WorkoutListActivity workoutListActivity = (WorkoutListActivity) this;
            ((t5) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f49039a = b10;
            if (b10.b()) {
                this.f49039a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f49039a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_WorkoutListActivity(int i11) {
        super(C1987R.layout.activity_workout_list);
        this.f49041c = new Object();
        this.f49042d = false;
        addOnContextAvailableListener(new b0(this));
    }
}
