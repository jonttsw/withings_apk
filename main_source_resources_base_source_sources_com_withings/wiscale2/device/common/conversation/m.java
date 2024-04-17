package com.withings.wiscale2.device.common.conversation;

import com.google.gson.JsonObject;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.WamVasistasHead;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import org.joda.time.DateTime;
/* compiled from: VasistasSyncConversation.kt */
/* loaded from: classes5.dex */
public final class m implements VasistasSyncConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.comm.trace.e f50823a;

    /* renamed from: b  reason: collision with root package name */
    private int f50824b;

    /* renamed from: c  reason: collision with root package name */
    private int f50825c;

    /* renamed from: d  reason: collision with root package name */
    private int f50826d;

    /* renamed from: e  reason: collision with root package name */
    private int f50827e;

    /* renamed from: f  reason: collision with root package name */
    private int f50828f;

    /* renamed from: g  reason: collision with root package name */
    private int f50829g;

    /* renamed from: h  reason: collision with root package name */
    private int f50830h;

    /* renamed from: i  reason: collision with root package name */
    private int f50831i;

    /* renamed from: j  reason: collision with root package name */
    private int f50832j;

    /* renamed from: k  reason: collision with root package name */
    private int f50833k;

    /* renamed from: l  reason: collision with root package name */
    private int f50834l;

    /* renamed from: m  reason: collision with root package name */
    private int f50835m;

    /* compiled from: VasistasSyncConversation.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f50836a;

        static {
            int[] iArr = new int[Vasistas.VasistasType.values().length];
            try {
                iArr[Vasistas.VasistasType.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Vasistas.VasistasType.DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Vasistas.VasistasType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Vasistas.VasistasType.SWIM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Vasistas.VasistasType.SPO2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Vasistas.VasistasType.AHI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f50836a = iArr;
        }
    }

    public m() {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        kotlin.jvm.internal.u.i(a11, "get(...)");
        this.f50823a = a11;
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void a(VasistasSyncConversation vasistasSyncConversation, int i11) {
        kotlin.jvm.internal.u.j(vasistasSyncConversation, "vasistasSyncConversation");
        this.f50823a.d(vasistasSyncConversation.x(), Traces.b.a(vasistasSyncConversation.S().name(), i11, this.f50824b, this.f50825c / 1000, this.f50826d, this.f50827e / 1000, this.f50828f, this.f50829g / 1000, this.f50830h, this.f50831i / 1000, this.f50832j, this.f50833k / 1000, this.f50834l, this.f50835m / 1000));
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void c(VasistasSyncConversation vasistasSyncConversation, DateTime dateTime) {
        cj.b x11 = vasistasSyncConversation.x();
        String name = vasistasSyncConversation.S().name();
        JsonObject a11 = Traces.a("vasistas_sync_start");
        a11.addProperty("utc_since", Traces.b(dateTime));
        a11.addProperty("category", name);
        this.f50823a.d(x11, a11);
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void d(VasistasSyncConversation vasistasSyncConversation, Vasistas vasistas) {
        int i11;
        Vasistas.VasistasType type = vasistas.getType();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = a.f50836a[type.ordinal()];
        }
        switch (i11) {
            case 1:
                this.f50824b++;
                this.f50825c = vasistas.getDurationMillis() + this.f50825c;
                return;
            case 2:
                this.f50826d++;
                this.f50827e = vasistas.getDurationMillis() + this.f50827e;
                return;
            case 3:
                this.f50828f++;
                this.f50829g = vasistas.getDurationMillis() + this.f50829g;
                return;
            case 4:
                this.f50830h++;
                this.f50831i = vasistas.getDurationMillis() + this.f50831i;
                return;
            case 5:
                this.f50832j++;
                this.f50833k = vasistas.getDurationMillis() + this.f50833k;
                return;
            case 6:
                this.f50834l++;
                this.f50835m = vasistas.getDurationMillis() + this.f50835m;
                return;
            default:
                return;
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void b(VasistasSyncConversation vasistasSyncConversation, qj.c<WamVasistasHead> cVar, Vasistas vasistas) {
    }
}
