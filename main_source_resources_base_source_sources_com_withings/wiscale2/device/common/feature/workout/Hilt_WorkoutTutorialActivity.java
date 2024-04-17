package com.withings.wiscale2.device.common.feature.workout;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import dagger.hilt.android.internal.managers.g;
/* loaded from: classes5.dex */
public abstract class Hilt_WorkoutTutorialActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private g f52613a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f52614b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f52615c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52616d;

    Hilt_WorkoutTutorialActivity() {
        this.f52615c = new Object();
        this.f52616d = false;
        addOnContextAvailableListener(new a(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f52614b == null) {
            synchronized (this.f52615c) {
                try {
                    if (this.f52614b == null) {
                        this.f52614b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f52614b;
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
        if (!this.f52616d) {
            this.f52616d = true;
            ((f) generatedComponent()).M0((WorkoutTutorialActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            g b10 = componentManager().b();
            this.f52613a = b10;
            if (b10.b()) {
                this.f52613a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f52613a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_WorkoutTutorialActivity(int i11) {
        super(C1987R.layout.activity_workout_tutorial);
        this.f52615c = new Object();
        this.f52616d = false;
        addOnContextAvailableListener(new a(this));
    }
}
