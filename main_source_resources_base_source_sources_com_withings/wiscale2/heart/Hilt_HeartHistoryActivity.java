package com.withings.wiscale2.heart;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_HeartHistoryActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f57062a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f57063b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f57064c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f57065d;

    Hilt_HeartHistoryActivity() {
        this.f57064c = new Object();
        this.f57065d = false;
        addOnContextAvailableListener(new s(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f57063b == null) {
            synchronized (this.f57064c) {
                try {
                    if (this.f57063b == null) {
                        this.f57063b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f57063b;
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
        if (!this.f57065d) {
            this.f57065d = true;
            ((o) generatedComponent()).J((HeartHistoryActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f57062a = b10;
            if (b10.b()) {
                this.f57062a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f57062a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_HeartHistoryActivity(int i11) {
        super(C1987R.layout.activity_heart_history);
        this.f57064c = new Object();
        this.f57065d = false;
        addOnContextAvailableListener(new s(this));
    }
}
