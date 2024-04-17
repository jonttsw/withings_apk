package com.withings.wiscale2.device.common.conversation;

import androidx.activity.b0;
import androidx.camera.camera2.internal.o0;
import androidx.camera.core.q1;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.AlgorithmVersion;
import com.withings.comm.wpp.generated.object.FirmwareVersion;
import com.withings.comm.wpp.generated.object.VasistasCbt;
import com.withings.comm.wpp.generated.object.VasistasType;
import com.withings.comm.wpp.generated.object.Version;
import com.withings.comm.wpp.generated.object.WamVasistasGet;
import com.withings.comm.wpp.generated.object.WamVasistasHead;
import com.withings.target.data.LocalTargetRepository;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.vasistas.fixer.CalorieVasistasFixer;
import com.withings.vasistas.fixer.SwimVasistasFixer;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import lj0.c0;
import lj0.h0;
import lj0.k0;
import lj0.n0;
import org.joda.time.DateTime;
import qj.b;
import u70.h;
/* compiled from: VasistasSyncConversation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/VasistasSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lqj/b$a;", "Lcom/withings/comm/wpp/generated/object/WamVasistasHead;", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VasistasSyncConversation extends WppDeviceConversation implements b.a<WamVasistasHead> {

    /* renamed from: f  reason: collision with root package name */
    private final User f50768f;

    /* renamed from: g  reason: collision with root package name */
    private final Vasistas.Category f50769g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f50770h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f50771i;

    /* renamed from: j  reason: collision with root package name */
    private final h0 f50772j;

    /* renamed from: k  reason: collision with root package name */
    private final kn.e f50773k;

    /* renamed from: l  reason: collision with root package name */
    private final n0 f50774l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f50775m;

    /* renamed from: n  reason: collision with root package name */
    private final TargetRepository f50776n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f50777o;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f50778p;

    /* renamed from: q  reason: collision with root package name */
    private final long f50779q;

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f50780r;

    /* renamed from: s  reason: collision with root package name */
    private u f50781s;

    /* renamed from: t  reason: collision with root package name */
    private final SwimVasistasFixer f50782t;

    /* renamed from: u  reason: collision with root package name */
    private final CalorieVasistasFixer f50783u;

    /* renamed from: v  reason: collision with root package name */
    private final u70.h<a> f50784v;

    /* renamed from: w  reason: collision with root package name */
    private final ArrayList f50785w;

    /* compiled from: VasistasSyncConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void a(VasistasSyncConversation vasistasSyncConversation, int i11);

        void b(VasistasSyncConversation vasistasSyncConversation, qj.c<WamVasistasHead> cVar, Vasistas vasistas);

        void c(VasistasSyncConversation vasistasSyncConversation, DateTime dateTime);

        void d(VasistasSyncConversation vasistasSyncConversation, Vasistas vasistas);
    }

    /* compiled from: VasistasSyncConversation.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50786a;

        static {
            int[] iArr = new int[Vasistas.Category.values().length];
            try {
                iArr[Vasistas.Category.MOTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vasistas.Category.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vasistas.Category.SWIM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Vasistas.Category.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Vasistas.Category.SPO2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Vasistas.Category.AHI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Vasistas.Category.CORE_TEMPERATURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f50786a = iArr;
        }
    }

    public VasistasSyncConversation(User user, Vasistas.Category category, Integer num, boolean z5, int i11) {
        num = (i11 & 4) != 0 ? null : num;
        h0 e11 = h0.e();
        kotlin.jvm.internal.u.i(e11, "get(...)");
        kn.e c11 = kn.e.c();
        kotlin.jvm.internal.u.i(c11, "get(...)");
        n0 n0Var = n0.f79890b;
        if (n0Var != null) {
            z5 = (i11 & 128) != 0 ? false : z5;
            TargetRepository targetRepository = LocalTargetRepository.Companion.get();
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(category, "category");
            kotlin.jvm.internal.u.j(targetRepository, "targetRepository");
            this.f50768f = user;
            this.f50769g = category;
            this.f50770h = num;
            this.f50771i = false;
            this.f50772j = e11;
            this.f50773k = c11;
            this.f50774l = n0Var;
            this.f50775m = z5;
            this.f50776n = targetRepository;
            this.f50777o = nm0.h.b(new q(this));
            this.f50778p = nm0.h.b(new p(this));
            this.f50779q = DateTime.now().withDayOfMonth(1).withMonthOfYear(6).withYear(2013).withTimeAtStartOfDay().getMillis();
            this.f50780r = nm0.h.b(new s(this));
            this.f50782t = new SwimVasistasFixer(user);
            this.f50783u = new CalorieVasistasFixer(user);
            this.f50784v = new u70.h<>();
            this.f50785w = new ArrayList();
            return;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static void L(VasistasSyncConversation this$0, a aVar) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        aVar.a(this$0, this$0.f50785w.size());
    }

    public static final fl.o O(VasistasSyncConversation vasistasSyncConversation) {
        return (fl.o) vasistasSyncConversation.f50777o.getValue();
    }

    private final List<com.withings.comm.wpp.h> R(long j5) {
        Integer num = this.f50770h;
        if (num != null) {
            return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(num.intValue()));
        }
        int[] iArr = b.f50786a;
        Vasistas.Category category = this.f50769g;
        switch (iArr[category.ordinal()]) {
            case 1:
            case 2:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new Version().setValue((short) 1));
            case 3:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(5));
            case 4:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(6));
            case 5:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(8));
            case 6:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(9));
            case 7:
                return x.W(new WamVasistasGet().setUtcStart(b0.w(new DateTime(j5))), new VasistasType().setValue(10));
            default:
                throw new UnsupportedOperationException("Unsupported vasistas category : " + category);
        }
    }

    private final short T() {
        if (this.f50770h != null) {
            return (short) 1286;
        }
        int[] iArr = b.f50786a;
        Vasistas.Category category = this.f50769g;
        switch (iArr[category.ordinal()]) {
            case 1:
                return (short) 1286;
            case 2:
                return (short) 2344;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return (short) 2424;
            default:
                throw new UnsupportedOperationException("Unsupported vasistas category : " + category);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long U() {
        return ((Number) this.f50778p.getValue()).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long V(long r6) {
        /*
            r5 = this;
            lj0.h0 r0 = r5.f50772j
            r0.getClass()
            lj0.n0 r1 = r5.f50774l
            com.withings.vasistas.model.Vasistas$Category r2 = r5.f50769g
            long r6 = r1.a(r6, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r3 = 0
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L42
            com.withings.user.User r6 = r5.f50768f
            long r6 = r6.q()
            com.withings.vasistas.model.Vasistas r6 = r0.k(r6, r2)
            boolean r7 = r5.f50771i
            r0 = 0
            if (r7 == 0) goto L2f
            if (r6 == 0) goto L2d
            org.joda.time.DateTime r6 = r6.getStartDate()
            goto L35
        L2d:
            r6 = r0
            goto L35
        L2f:
            if (r6 == 0) goto L2d
            org.joda.time.DateTime r6 = r6.getEnd()
        L35:
            if (r6 == 0) goto L41
            long r6 = r6.getMillis()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1 = r6
            goto L42
        L41:
            r1 = r0
        L42:
            if (r1 != 0) goto L47
            long r6 = r5.f50779q
            goto L4b
        L47:
            long r6 = r1.longValue()
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.V(long):long");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Y() {
        Integer num = this.f50770h;
        if (num != null && num != null && num.intValue() == 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [lj0.h0] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        ArrayList arrayList;
        boolean z5;
        int i11;
        boolean z11;
        String str;
        h0 h0Var;
        String str2;
        h0 h0Var2;
        h.a<a> bVar;
        DateTime plusSeconds;
        String str3;
        h0 h0Var3;
        ?? r22 = this.f50772j;
        String str4 = " vasistas to the vasistas insertor";
        ?? r42 = "Sending ";
        u70.h<a> hVar = this.f50784v;
        Vasistas.Category category = this.f50769g;
        n0 n0Var = this.f50774l;
        User user = this.f50768f;
        ArrayList arrayList2 = this.f50785w;
        try {
            x70.b.c(this, x().g(), "Vasistas synchronisation started for category " + category, new Object[0]);
            long V = V(U());
            DateTime dateTime = new DateTime(V);
            plusSeconds = new DateTime(V).plusSeconds(1);
            u70.i g11 = x().g();
            try {
                kotlin.jvm.internal.u.i(g11, "getMac(...)");
                this.f50781s = new u(g11, dateTime);
                hVar.f(new q1(5, this, plusSeconds));
                x70.b.c(this, x().g(), "Asking all vasistas since " + plusSeconds, new Object[0]);
                arrayList = arrayList2;
            } catch (UnsupportedCommandException unused) {
                i11 = 5;
                arrayList = arrayList2;
                h0Var3 = r22;
                str3 = r42;
            } catch (Throwable th2) {
                th = th2;
                arrayList = arrayList2;
            }
        } catch (UnsupportedCommandException unused2) {
            i11 = 5;
            arrayList = arrayList2;
            z11 = true;
            h0Var2 = r22;
            str2 = r42;
        } catch (Throwable th3) {
            th = th3;
            arrayList = arrayList2;
            z5 = true;
            h0Var = r22;
            str = r42;
        }
        try {
            if (this.f50775m) {
                nj.c cVar = new nj.c(x());
                cVar.u(30000L);
                cVar.z(new qj.b(x.W(AlgorithmVersion.class, FirmwareVersion.class), WamVasistasHead.class, this));
                cVar.b(R(plusSeconds.getMillis()), T());
                cVar.g((short) 2402);
            } else {
                nj.c cVar2 = new nj.c(x());
                cVar2.u(30000L);
                cVar2.z(new qj.b(x.W(AlgorithmVersion.class, FirmwareVersion.class), WamVasistasHead.class, this));
                cVar2.b(R(plusSeconds.getMillis()), T());
                cVar2.j();
            }
            u70.i g12 = x().g();
            str4 = o0.a("Sending ", arrayList.size(), " vasistas to the vasistas insertor");
            r42 = new Object[0];
            x70.b.c(this, g12, str4, r42);
            new c0(r22).a(user.q(), arrayList, this.f50769g, x().g());
            r22 = !arrayList.isEmpty();
            if (r22 != 0 && Y()) {
                n0Var.c(new k0(user.q(), U(), category.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((Vasistas) it.next()).getAscent() > 0.0f) {
                        if (Y()) {
                            n0Var.c(new k0(user.q(), U(), Vasistas.Category.ELEVATION.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
                        }
                    }
                }
            }
            bVar = new t.u(this, 5);
        } catch (UnsupportedCommandException unused3) {
            i11 = 5;
            h0Var3 = r22;
            str3 = r42;
            z11 = true;
            h0Var2 = h0Var3;
            str2 = str3;
            x70.b.c(this, x().g(), o0.a(str2, arrayList.size(), str4), new Object[0]);
            new c0(h0Var2).a(user.q(), arrayList, this.f50769g, x().g());
            if ((arrayList.isEmpty() ^ z11) && Y()) {
                n0Var.c(new k0(user.q(), U(), category.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((Vasistas) it2.next()).getAscent() > 0.0f) {
                        if (Y()) {
                            n0Var.c(new k0(user.q(), U(), Vasistas.Category.ELEVATION.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
                        }
                    }
                }
            }
            bVar = new androidx.camera.lifecycle.b(this, i11);
            hVar.f(bVar);
        } catch (Throwable th4) {
            th = th4;
            z5 = true;
            h0Var = r22;
            str = r42;
            x70.b.c(this, x().g(), o0.a(str, arrayList.size(), str4), new Object[0]);
            new c0(h0Var).a(user.q(), arrayList, this.f50769g, x().g());
            if ((arrayList.isEmpty() ^ z5) && Y()) {
                n0Var.c(new k0(user.q(), U(), category.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    } else if (((Vasistas) it3.next()).getAscent() > 0.0f) {
                        if (Y()) {
                            n0Var.c(new k0(user.q(), U(), Vasistas.Category.ELEVATION.getValue(), ((Vasistas) x.T(arrayList)).getEnd().getMillis()));
                        }
                    }
                }
            }
            hVar.f(new v.a(this, 4));
            throw th;
        }
        hVar.f(bVar);
    }

    public final Vasistas.Category S() {
        return this.f50769g;
    }

    public final User W() {
        return this.f50768f;
    }

    public final boolean X() {
        return !this.f50785w.isEmpty();
    }

    public final void Z(a listener) {
        kotlin.jvm.internal.u.j(listener, "listener");
        this.f50784v.b(listener);
    }

    @Override // qj.b.a
    public final void d(final qj.c<WamVasistasHead> compositeWppObject) {
        kotlin.jvm.internal.u.j(compositeWppObject, "compositeWppObject");
        final Vasistas a11 = ((o) this.f50780r.getValue()).a(compositeWppObject);
        u70.h<a> hVar = this.f50784v;
        hVar.f(new h.a() { // from class: xb0.m
            @Override // u70.h.a
            public final void e(Object obj) {
                VasistasSyncConversation this$0 = VasistasSyncConversation.this;
                u.j(this$0, "this$0");
                qj.c<WamVasistasHead> compositeWppObject2 = compositeWppObject;
                u.j(compositeWppObject2, "$compositeWppObject");
                Vasistas vasistas = a11;
                u.j(vasistas, "$vasistas");
                ((VasistasSyncConversation.a) obj).b(this$0, compositeWppObject2, vasistas);
            }
        });
        u uVar = this.f50781s;
        if (uVar != null) {
            if (uVar.a(a11)) {
                this.f50782t.fixCalories(a11);
                this.f50783u.fix(a11);
                a11.setFirmwareVersion(Integer.valueOf((int) x().i().softVersion));
                int i11 = (a11.getAscent() > 0.0f ? 1 : (a11.getAscent() == 0.0f ? 0 : -1));
                ArrayList arrayList = this.f50785w;
                if (i11 > 0) {
                    Vasistas.Category category = Vasistas.Category.ELEVATION;
                    DateTime startDate = a11.getStartDate();
                    int durationMillis = a11.getDurationMillis();
                    long q11 = this.f50768f.q();
                    long deviceId = a11.getDeviceId();
                    int deviceModel = a11.getDeviceModel();
                    Vasistas.VasistasType vasistasType = Vasistas.VasistasType.ELEVATION;
                    boolean isTrusted = a11.isTrusted();
                    Vasistas vasistas = new Vasistas(startDate, null, Long.valueOf(q11), durationMillis, vasistasType, null, category, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, deviceModel, 0, 0, 0, deviceId, null, null, null, null, null, false, 0, 0, 0, null, a11.getFirmwareVersion(), null, null, isTrusted, null, -142606430, 1471, null);
                    vasistas.setAscent(a11.getAscent());
                    arrayList.add(vasistas);
                    a11.setAscent(0.0f);
                }
                VasistasCbt vasistasCbt = (VasistasCbt) compositeWppObject.b(VasistasCbt.class);
                if (vasistasCbt != null && vasistasCbt.attrib == 5) {
                    BuildersKt__BuildersKt.runBlocking$default(null, new r(this, a11, null), 1, null);
                    return;
                }
                arrayList.add(a11);
                hVar.f(new w6.e(3, this, a11));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("vasistasValidator");
        throw null;
    }
}
