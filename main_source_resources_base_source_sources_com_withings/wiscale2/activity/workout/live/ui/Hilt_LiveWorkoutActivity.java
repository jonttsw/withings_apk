package com.withings.wiscale2.activity.workout.live.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public abstract class Hilt_LiveWorkoutActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f48787a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f48788b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f48789c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48790d;

    Hilt_LiveWorkoutActivity() {
        this.f48789c = new Object();
        this.f48790d = false;
        addOnContextAvailableListener(new f(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f48788b == null) {
            synchronized (this.f48789c) {
                try {
                    if (this.f48788b == null) {
                        this.f48788b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f48788b;
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
        if (!this.f48790d) {
            this.f48790d = true;
            ((w) generatedComponent()).z0((LiveWorkoutActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f48787a = b10;
            if (b10.b()) {
                this.f48787a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f48787a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_LiveWorkoutActivity(int i11) {
        super(C1987R.layout.activity_workout_live_view);
        this.f48789c = new Object();
        this.f48790d = false;
        addOnContextAvailableListener(new f(this));
    }
}
