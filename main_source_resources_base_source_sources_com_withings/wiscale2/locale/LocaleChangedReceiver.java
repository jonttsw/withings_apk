package com.withings.wiscale2.locale;

import android.content.Context;
import android.content.Intent;
import ar.b;
import com.withings.account.core.model.Account;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.webservices.legacy.sync.SerialSyncJob;
import com.withings.workout.category.model.WorkoutCategory;
import com.withings.workout.category.model.WorkoutCategoryMigrationHelper;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import m70.i;
import nm0.y;
import t00.d;
import t00.g;
import vf.c;
import ym0.l;
/* compiled from: LocaleChangedReceiver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/locale/LocaleChangedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LocaleChangedReceiver extends Hilt_LocaleChangedReceiver {
    @Inject

    /* renamed from: c  reason: collision with root package name */
    public i f57994c;
    @Inject

    /* renamed from: d  reason: collision with root package name */
    public c f57995d;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public lg.a f57996e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public d f57997f;

    /* compiled from: LocaleChangedReceiver.kt */
    @e(c = "com.withings.wiscale2.locale.LocaleChangedReceiver$onReceive$1", f = "LocaleChangedReceiver.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements l<qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f57999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LocaleChangedReceiver f58000c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, LocaleChangedReceiver localeChangedReceiver, qm0.d<? super a> dVar) {
            super(1, dVar);
            this.f57999b = context;
            this.f58000c = localeChangedReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(qm0.d<?> dVar) {
            return new a(this.f57999b, this.f58000c, dVar);
        }

        @Override // ym0.l
        public final Object invoke(qm0.d<? super y> dVar) {
            return ((a) create(dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f57998a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                WorkoutCategoryMigrationHelper.get(this.f57999b).setShouldRedownloadCategories(Boolean.TRUE);
                WorkoutCategory.clearCategories();
                LocaleChangedReceiver localeChangedReceiver = this.f58000c;
                c cVar = localeChangedReceiver.f57995d;
                if (cVar != null) {
                    Account i12 = cVar.i();
                    i iVar = localeChangedReceiver.f57994c;
                    if (iVar != null) {
                        User f11 = iVar.f();
                        if (i12 != null && f11 != null) {
                            c cVar2 = localeChangedReceiver.f57995d;
                            if (cVar2 != null) {
                                Locale locale = Locale.getDefault();
                                u.i(locale, "getDefault(...)");
                                cVar2.n(Account.a(i12, null, false, locale, null, null, null, true, false, false, 443));
                                lg.a aVar = localeChangedReceiver.f57996e;
                                if (aVar != null) {
                                    ActionSyncJob a11 = aVar.a(true);
                                    d dVar = localeChangedReceiver.f57997f;
                                    if (dVar != null) {
                                        SerialSyncJob serialSyncJob = new SerialSyncJob(a11);
                                        this.f57998a = 1;
                                        if (g.a(dVar, serialSyncJob, "onLocaleChanged", this) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        u.s("networkSyncManager");
                                        throw null;
                                    }
                                } else {
                                    u.s("accountSyncFactory");
                                    throw null;
                                }
                            } else {
                                u.s("accountManager");
                                throw null;
                            }
                        }
                    } else {
                        u.s("userManager");
                        throw null;
                    }
                } else {
                    u.s("accountManager");
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    @Override // com.withings.wiscale2.locale.Hilt_LocaleChangedReceiver, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        u.j(context, "context");
        u.j(intent, "intent");
        b.a(this, GlobalScope.INSTANCE, Dispatchers.getIO(), new a(context, this, null));
    }
}
