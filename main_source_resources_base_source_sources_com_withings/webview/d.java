package com.withings.webview;

import android.webkit.WebView;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.CoroutineScope;
import nm0.j;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: PrivateWebviewManager.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.webview.PrivateWebviewManager$handleUrlBlocking$1", f = "PrivateWebviewManager.kt", l = {65, 66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    String f46895a;

    /* renamed from: b  reason: collision with root package name */
    String f46896b;

    /* renamed from: c  reason: collision with root package name */
    Object f46897c;

    /* renamed from: d  reason: collision with root package name */
    Serializable f46898d;

    /* renamed from: e  reason: collision with root package name */
    String f46899e;

    /* renamed from: f  reason: collision with root package name */
    String f46900f;

    /* renamed from: g  reason: collision with root package name */
    int f46901g;

    /* renamed from: h  reason: collision with root package name */
    private /* synthetic */ Object f46902h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f46903i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ l0 f46904j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ WebView f46905k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PrivateWebviewManager.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.webview.PrivateWebviewManager$handleUrlBlocking$1$jsonResponse$executionResult$1", f = "PrivateWebviewManager.kt", l = {64}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends i implements p<CoroutineScope, qm0.d<? super j<? extends JsonObject, ? extends Boolean>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f46906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f46907b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f46908c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f46909d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2, Map<String, String> map, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f46907b = str;
            this.f46908c = str2;
            this.f46909d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f46907b, this.f46908c, this.f46909d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super j<? extends JsonObject, ? extends Boolean>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f46906a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                b bVar = b.f46889a;
                this.f46906a = 1;
                obj = b.a(bVar, this.f46907b, this.f46908c, this.f46909d, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, l0 l0Var, WebView webView, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f46903i = str;
        this.f46904j = l0Var;
        this.f46905k = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        d dVar2 = new d(this.f46903i, this.f46904j, this.f46905k, dVar);
        dVar2.f46902h = obj;
        return dVar2;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:57|(1:(8:60|61|62|23|24|(1:26)|27|28)(2:63|64))(3:65|66|67))(5:3|(4:6|(2:8|9)(1:11)|10|4)|12|13|(1:15)(1:17))|18|19|(1:21)(6:22|23|24|(0)|27|28)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0123, code lost:
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0124, code lost:
        r3 = r1;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0127, code lost:
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0128, code lost:
        r3 = r1;
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
        r15 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012c, code lost:
        r3 = r1;
        r10 = r5;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x002f: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:10:0x002f */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0035: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:12:0x0035 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x003b: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:14:0x003b */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:10:0x002f */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0036: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:12:0x0035 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x003c: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:14:0x003b */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0031: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x002f */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0037: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:12:0x0035 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x003d: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:14:0x003b */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0174  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.webview.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
