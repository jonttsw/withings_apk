package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.withings.wiscale2.track.data.Track;
/* compiled from: WorkoutSyncDoneLiveData.kt */
/* loaded from: classes4.dex */
public final class v7 extends androidx.lifecycle.j0<Boolean> implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<Track> f49756a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f49757b;

    /* compiled from: WorkoutSyncDoneLiveData.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Track, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Track track) {
            v7 v7Var = v7.this;
            v7Var.x(v7Var.f49757b);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WorkoutSyncDoneLiveData.kt */
    /* loaded from: classes4.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f49759a;

        b(ym0.l lVar) {
            this.f49759a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f49759a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f49759a;
        }

        public final int hashCode() {
            return this.f49759a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49759a.invoke(obj);
        }
    }

    public v7(LiveData<Track> workoutLiveData, SharedPreferences sharedPreferences) {
        kotlin.jvm.internal.u.j(workoutLiveData, "workoutLiveData");
        this.f49756a = workoutLiveData;
        this.f49757b = sharedPreferences;
        addSource(workoutLiveData, new b(new a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(SharedPreferences sharedPreferences) {
        boolean z5;
        Track value = this.f49756a.getValue();
        if (value != null) {
            if (sharedPreferences.getLong(androidx.camera.camera2.internal.q.c("lastStepTrackerSync", value.getUserId()), 0L) > value.getEndDate().getMillis()) {
                z5 = true;
            } else {
                z5 = false;
            }
            setValue(Boolean.valueOf(z5));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        this.f49757b.registerOnSharedPreferenceChangeListener(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.j0, androidx.lifecycle.LiveData
    public final void onInactive() {
        super.onInactive();
        this.f49757b.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        kotlin.jvm.internal.u.j(sharedPreferences, "sharedPreferences");
        x(sharedPreferences);
    }
}
