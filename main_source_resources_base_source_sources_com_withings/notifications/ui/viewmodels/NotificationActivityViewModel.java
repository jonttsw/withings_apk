package com.withings.notifications.ui.viewmodels;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.u0;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.notifications.ui.viewmodels.d;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: NotificationActivityViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/notifications/ui/viewmodels/NotificationActivityViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NotificationActivityViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final d10.b f43119a;

    /* renamed from: b  reason: collision with root package name */
    private final a10.a f43120b;

    /* renamed from: c  reason: collision with root package name */
    private final long f43121c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedFlow<List<c10.c<?>>> f43122d;

    /* renamed from: e  reason: collision with root package name */
    private final StateFlow<j10.b> f43123e;

    @Inject
    public NotificationActivityViewModel(z00.d dVar, x00.b bVar, u0 savedStateHandle) {
        u.j(savedStateHandle, "savedStateHandle");
        this.f43119a = dVar;
        this.f43120b = bVar;
        Object c11 = savedStateHandle.c(HealthUserProfile.USER_PROFILE_KEY_USER_ID);
        if (c11 != null) {
            long longValue = ((Number) c11).longValue();
            this.f43121c = longValue;
            Flow<List<c10.c<?>>> f11 = bVar.f(longValue);
            CoroutineScope a11 = h1.a(this);
            SharingStarted.Companion companion = SharingStarted.Companion;
            SharedFlow<List<c10.c<?>>> shareIn = FlowKt.shareIn(f11, a11, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
            this.f43122d = shareIn;
            this.f43123e = FlowKt.stateIn(new j10.a(shareIn), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), new j10.b(null));
            return;
        }
        throw new IllegalArgumentException("NotificationActivity requires USER_ID".toString());
    }

    public final StateFlow<j10.b> k0() {
        return this.f43123e;
    }

    public final void m0(d dVar) {
        if (dVar instanceof d.b) {
            int ordinal = ((d.b) dVar).a().ordinal();
            if (ordinal == 0) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(this, null), 2, null);
            } else if (ordinal == 1) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new c(this, null), 2, null);
            }
        } else if (dVar instanceof d.a) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(this, ((d.a) dVar).a(), null), 2, null);
        }
    }
}
