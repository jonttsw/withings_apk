package com.withings.survey.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_InAppSurveyActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f44284a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f44285b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f44286c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f44287d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_InAppSurveyActivity() {
        addOnContextAvailableListener(new r(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f44285b == null) {
            synchronized (this.f44286c) {
                try {
                    if (this.f44285b == null) {
                        this.f44285b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f44285b;
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
        if (!this.f44287d) {
            this.f44287d = true;
            InAppSurveyActivity inAppSurveyActivity = (InAppSurveyActivity) this;
            ((u1) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f44284a = b10;
            if (b10.b()) {
                this.f44284a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f44284a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
