package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import dagger.hilt.android.internal.managers.g;
/* loaded from: classes5.dex */
public abstract class Hilt_FoodActivity extends WithingsActivity implements ik0.b {
    private volatile dagger.hilt.android.internal.managers.a componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private g savedStateHandleHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_FoodActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new f.b() { // from class: com.withings.wiscale2.food.ui.display.Hilt_FoodActivity.1
            @Override // f.b
            public void onContextAvailable(Context context) {
                Hilt_FoodActivity.this.inject();
            }
        });
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof ik0.b) {
            g b10 = m38componentManager().b();
            this.savedStateHandleHolder = b10;
            if (b10.b()) {
                this.savedStateHandleHolder.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    protected dagger.hilt.android.internal.managers.a createComponentManager() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return m38componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.u
    public k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    protected void inject() {
        if (!this.injected) {
            this.injected = true;
            ((FoodActivity_GeneratedInjector) generatedComponent()).injectFoodActivity((FoodActivity) this);
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
    public final dagger.hilt.android.internal.managers.a m38componentManager() {
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

    Hilt_FoodActivity(int i11) {
        super(i11);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }
}