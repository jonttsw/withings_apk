package com.withings.wiscale2.chat.ui;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.spo2.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$onFailedToPushMessage$1", f = "ChatActivity.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f50379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChatActivity f50380b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.chat.ui.ChatActivity$onFailedToPushMessage$1$1", f = "ChatActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatActivity f50381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ChatActivity chatActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f50381a = chatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f50381a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            new m();
            ob0.b bVar = this.f50381a.f50329o;
            if (bVar != null) {
                ob0.a.d(bVar);
                return y.f85009a;
            }
            u.s("currentItemChat");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ChatActivity chatActivity, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f50380b = chatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f50380b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f50379a;
        ChatActivity chatActivity = this.f50380b;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            ob0.b bVar = chatActivity.f50329o;
            if (bVar != null) {
                bVar.m(3);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(chatActivity, null);
                this.f50379a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("currentItemChat");
                throw null;
            }
        }
        ChatActivity.z3(chatActivity).z1();
        Toast.makeText(chatActivity, (int) C1987R.string._ERROR_, 0).show();
        return y.f85009a;
    }
}
