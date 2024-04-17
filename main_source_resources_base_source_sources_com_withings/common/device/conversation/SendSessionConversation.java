package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.FeatureMask;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.ScaleSession;
import com.withings.comm.wpp.h;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: SendSessionConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/conversation/SendSessionConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendSessionConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35152f;

    /* compiled from: SendSessionConversation.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements l<xp.a, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p0<xp.a> f35153a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p0<xp.a> p0Var) {
            super(1);
            this.f35153a = p0Var;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [xp.a, T, java.lang.Object] */
        @Override // ym0.l
        public final y invoke(xp.a aVar) {
            xp.a it = aVar;
            u.j(it, "it");
            this.f35153a.f76257a = it;
            return y.f85009a;
        }
    }

    public SendSessionConversation(boolean z5) {
        this.f35152f = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.i0] */
    /* JADX WARN: Type inference failed for: r2v4 */
    private static ArrayList L(String str) {
        ?? r22;
        ArrayList<List> i02 = x.i0(new ArrayList());
        u.j(str, "<this>");
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                r22 = new ArrayList(str.length());
                for (int i11 = 0; i11 < str.length(); i11++) {
                    r22.add(Character.valueOf(str.charAt(i11)));
                }
            } else {
                r22 = x.V(Character.valueOf(str.charAt(0)));
            }
        } else {
            r22 = i0.f76187a;
        }
        for (Character ch2 : (Iterable) r22) {
            ch2.getClass();
            byte[] bytes = new String(x.M0(x.m0(ch2, (Collection) x.T(i02)))).getBytes(dp0.c.f64094b);
            u.i(bytes, "getBytes(...)");
            if (bytes.length > 64) {
                i02.add(x.i0(ch2));
            } else {
                ((List) x.T(i02)).add(ch2);
            }
        }
        ArrayList arrayList = new ArrayList(x.y(i02, 10));
        for (List list : i02) {
            arrayList.add(new ScaleSession().setData(new String(x.M0(list))));
        }
        return arrayList;
    }

    private final void M(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x().k().j(new f((byte) 1, (short) 269, (ScaleSession) it.next()));
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e11) {
                x70.b.f(this, e11, "could not wait...", new Object[0]);
            }
        }
        nj.a aVar = new nj.a(x());
        aVar.c((short) 269, new Null());
        aVar.j();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException {
        Integer num;
        xp.a aVar;
        try {
            ?? aVar2 = new nj.a(x());
            aVar2.c(Wpp.CMD_FEATURE_MASK_GET, new h[0]);
            num = Integer.valueOf((int) ((FeatureMask) aVar2.y(FeatureMask.class)).mask);
        } catch (UnsupportedCommandException unused) {
            num = null;
        }
        try {
            String secret = x().i().secret;
            u.i(secret, "secret");
            if (secret.length() > 0) {
                aVar = new xp.b(x().i());
            } else {
                p0 p0Var = new p0();
                E(new DeviceSessionConversation(new a(p0Var), num, 6));
                T t11 = p0Var.f76257a;
                if (t11 != 0) {
                    aVar = (xp.a) t11;
                } else {
                    throw new IllegalArgumentException("DeviceSessionProvider from DeviceSessionConversation was not set".toString());
                }
            }
            String jSonWithStatus0 = aVar.b(num).getJSonWithStatus0();
            ArrayList L = L(jSonWithStatus0 + "\\0");
            if (this.f35152f) {
                nj.a aVar3 = new nj.a(x());
                aVar3.b(x.m0(new Null(), L), (short) 269);
                aVar3.j();
                return;
            }
            M(L);
        } catch (WsAuthFailedException unused2) {
            cj.b x11 = x();
            throw new IOException("Enabled to open session for device : " + x11);
        }
    }
}
