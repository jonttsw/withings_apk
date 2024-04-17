package com.withings.reminder.ringing;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import dagger.hilt.android.internal.managers.a;
import dagger.hilt.android.internal.managers.g;
import ik0.b;
/* loaded from: classes4.dex */
public abstract class Hilt_ReminderRingingActivity extends WithingsActivity implements b {
    private volatile a componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private g savedStateHandleHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ReminderRingingActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new f.b() { // from class: com.withings.reminder.ringing.Hilt_ReminderRingingActivity.1
            @Override // f.b
            public void onContextAvailable(Context context) {
                Hilt_ReminderRingingActivity.this.inject();
            }
        });
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof b) {
            g b10 = m32componentManager().b();
            this.savedStateHandleHolder = b10;
            if (b10.b()) {
                this.savedStateHandleHolder.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    protected a createComponentManager() {
        return new a(this);
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return m32componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.u
    public k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((ReminderRingingActivity_GeneratedInjector) generatedComponent()).injectReminderRingingActivity((ReminderRingingActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        g gVar = this.savedStateHandleHolder;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* renamed from: componentManager */
    public final a m32componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.componentManager;
    }

    Hilt_ReminderRingingActivity(int i11) {
        super(i11);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}
