package com.withings.wiscale2.healthsync.google.fit;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: FitSyncWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/healthsync/google/fit/FitSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class FitSyncWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56240a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56241b;

    /* renamed from: c  reason: collision with root package name */
    public User f56242c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f56243d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f56244e;

    /* compiled from: FitSyncWorker.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<t10.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56245a = new w(0);

        @Override // ym0.a
        public final t10.e invoke() {
            t10.e eVar;
            eVar = t10.e.f97966j;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalArgumentException("you must call init before using get".toString());
        }
    }

    /* compiled from: FitSyncWorker.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<m70.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f56246a = new w(0);

        @Override // ym0.a
        public final m70.i invoke() {
            return m70.i.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56240a = context;
        this.f56241b = 15;
        this.f56243d = nm0.h.b(b.f56246a);
        this.f56244e = nm0.h.b(a.f56245a);
    }

    public static final m70.i o(FitSyncWorker fitSyncWorker) {
        return (m70.i) fitSyncWorker.f56243d.getValue();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(qm0.d<? super o.a> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new com.withings.wiscale2.healthsync.google.fit.b(this, null), dVar);
    }

    public final Context getContext() {
        return this.f56240a;
    }

    public final User getUser() {
        User user = this.f56242c;
        if (user != null) {
            return user;
        }
        u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }

    public abstract Object t(Partner partner, qm0.d<? super o.a> dVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int v() {
        return this.f56241b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final t10.e w() {
        return (t10.e) this.f56244e.getValue();
    }
}
