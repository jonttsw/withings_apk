package com.withings.wiscale2.heart;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartHistoryActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.HeartHistoryActivity$loadAndShowData$1", f = "HeartHistoryActivity.kt", l = {405}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57777a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeartHistoryActivity f57778b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeartHistoryActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.HeartHistoryActivity$loadAndShowData$1$measuresGroupListResult$1", f = "HeartHistoryActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends MeasuresGroup>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HeartHistoryActivity f57779a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HeartHistoryActivity heartHistoryActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57779a = heartHistoryActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57779a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends MeasuresGroup>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            HeartHistoryActivity.b bVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            bVar = this.f57779a.f57038r;
            if (bVar != null) {
                return bVar.i();
            }
            u.s("delegate");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(HeartHistoryActivity heartHistoryActivity, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f57778b = heartHistoryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f57778b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MenuItem menuItem;
        HeartHistoryActivity.b bVar;
        HeartHistoryActivity.b bVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57777a;
        HeartHistoryActivity heartHistoryActivity = this.f57778b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(heartHistoryActivity, null);
            this.f57777a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List<? extends MeasuresGroup> list = (List) obj;
        heartHistoryActivity.f57039s = list;
        menuItem = heartHistoryActivity.f57026f;
        if (menuItem != null) {
            menuItem.setVisible(!list.isEmpty());
        }
        heartHistoryActivity.R3().f99488d.setVisibility(8);
        if (!list.isEmpty()) {
            bVar2 = heartHistoryActivity.f57038r;
            if (bVar2 != null) {
                bVar2.j(list);
            } else {
                u.s("delegate");
                throw null;
            }
        } else {
            heartHistoryActivity.finish();
        }
        bVar = heartHistoryActivity.f57038r;
        if (bVar != null) {
            DateTime a11 = bVar.a();
            if (a11 != null) {
                heartHistoryActivity.f57040t = a11;
            }
            heartHistoryActivity.W3(list);
            ViewGroup.LayoutParams layoutParams = heartHistoryActivity.R3().f99486b.getLayoutParams();
            Fragment item = heartHistoryActivity.V3().getItem(0);
            u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.heart.HeartFragment");
            layoutParams.height = ((f) item).k1(heartHistoryActivity);
            return y.f85009a;
        }
        u.s("delegate");
        throw null;
    }
}
