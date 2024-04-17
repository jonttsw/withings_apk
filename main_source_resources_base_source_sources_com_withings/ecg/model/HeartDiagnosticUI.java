package com.withings.ecg.model;

import androidx.appcompat.app.h;
import com.withings.common.compose.component.Status;
import com.withings.ecg.core.HeartDiagnostic;
import cp0.j0;
import cp0.n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* compiled from: HeartDiagnosticUI.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lcom/withings/ecg/model/HeartDiagnosticUI;", "", "heartDiagnostic", "Lcom/withings/ecg/core/HeartDiagnostic;", "type", "", "value", "colorRes", "iconRes", "statusIcon", "Lcom/withings/common/compose/component/Status$Icon;", "(Lcom/withings/ecg/core/HeartDiagnostic;IIIILcom/withings/common/compose/component/Status$Icon;)V", "getColorRes", "()I", "getHeartDiagnostic", "()Lcom/withings/ecg/core/HeartDiagnostic;", "getIconRes", "getStatusIcon", "()Lcom/withings/common/compose/component/Status$Icon;", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartDiagnosticUI {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int colorRes;
    private final HeartDiagnostic heartDiagnostic;
    private final int iconRes;
    private final Status.Icon statusIcon;
    private final int type;
    private final int value;

    /* compiled from: HeartDiagnosticUI.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/ecg/model/HeartDiagnosticUI$Companion;", "", "()V", "defaultDiagnostic", "Lcom/withings/ecg/model/HeartDiagnosticUI;", "type", "", "get", "value", "(ILjava/lang/Integer;)Lcom/withings/ecg/model/HeartDiagnosticUI;", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: HeartDiagnosticUI.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class EntriesMappings {
            public static final /* synthetic */ a<HeartDiagnostic> entries$0 = b.a(HeartDiagnostic.values());
        }

        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private final HeartDiagnosticUI defaultDiagnostic(int i11) {
            HeartDiagnostic heartDiagnostic;
            if (i11 == 2) {
                heartDiagnostic = HeartDiagnostic.f37987d;
            } else {
                heartDiagnostic = HeartDiagnostic.f37985b;
            }
            return HeartDiagnosticUIKt.toUI(heartDiagnostic);
        }

        public final HeartDiagnosticUI get(int i11, Integer num) {
            Object obj;
            Iterator it = n.t(x.t(EntriesMappings.entries$0), HeartDiagnosticUI$Companion$get$1.INSTANCE).iterator();
            while (true) {
                j0.a aVar = (j0.a) it;
                if (aVar.hasNext()) {
                    obj = aVar.next();
                    HeartDiagnosticUI heartDiagnosticUI = (HeartDiagnosticUI) obj;
                    int value = heartDiagnosticUI.getValue();
                    if (num != null && value == num.intValue() && heartDiagnosticUI.getType() == i11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            HeartDiagnosticUI heartDiagnosticUI2 = (HeartDiagnosticUI) obj;
            if (heartDiagnosticUI2 == null) {
                return defaultDiagnostic(i11);
            }
            return heartDiagnosticUI2;
        }

        private Companion() {
        }
    }

    public HeartDiagnosticUI(HeartDiagnostic heartDiagnostic, int i11, int i12, int i13, int i14, Status.Icon statusIcon) {
        u.j(heartDiagnostic, "heartDiagnostic");
        u.j(statusIcon, "statusIcon");
        this.heartDiagnostic = heartDiagnostic;
        this.type = i11;
        this.value = i12;
        this.colorRes = i13;
        this.iconRes = i14;
        this.statusIcon = statusIcon;
    }

    public static /* synthetic */ HeartDiagnosticUI copy$default(HeartDiagnosticUI heartDiagnosticUI, HeartDiagnostic heartDiagnostic, int i11, int i12, int i13, int i14, Status.Icon icon, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            heartDiagnostic = heartDiagnosticUI.heartDiagnostic;
        }
        if ((i15 & 2) != 0) {
            i11 = heartDiagnosticUI.type;
        }
        int i16 = i11;
        if ((i15 & 4) != 0) {
            i12 = heartDiagnosticUI.value;
        }
        int i17 = i12;
        if ((i15 & 8) != 0) {
            i13 = heartDiagnosticUI.colorRes;
        }
        int i18 = i13;
        if ((i15 & 16) != 0) {
            i14 = heartDiagnosticUI.iconRes;
        }
        int i19 = i14;
        if ((i15 & 32) != 0) {
            icon = heartDiagnosticUI.statusIcon;
        }
        return heartDiagnosticUI.copy(heartDiagnostic, i16, i17, i18, i19, icon);
    }

    public final HeartDiagnostic component1() {
        return this.heartDiagnostic;
    }

    public final int component2() {
        return this.type;
    }

    public final int component3() {
        return this.value;
    }

    public final int component4() {
        return this.colorRes;
    }

    public final int component5() {
        return this.iconRes;
    }

    public final Status.Icon component6() {
        return this.statusIcon;
    }

    public final HeartDiagnosticUI copy(HeartDiagnostic heartDiagnostic, int i11, int i12, int i13, int i14, Status.Icon statusIcon) {
        u.j(heartDiagnostic, "heartDiagnostic");
        u.j(statusIcon, "statusIcon");
        return new HeartDiagnosticUI(heartDiagnostic, i11, i12, i13, i14, statusIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeartDiagnosticUI)) {
            return false;
        }
        HeartDiagnosticUI heartDiagnosticUI = (HeartDiagnosticUI) obj;
        if (this.heartDiagnostic == heartDiagnosticUI.heartDiagnostic && this.type == heartDiagnosticUI.type && this.value == heartDiagnosticUI.value && this.colorRes == heartDiagnosticUI.colorRes && this.iconRes == heartDiagnosticUI.iconRes && this.statusIcon == heartDiagnosticUI.statusIcon) {
            return true;
        }
        return false;
    }

    public final int getColorRes() {
        return this.colorRes;
    }

    public final HeartDiagnostic getHeartDiagnostic() {
        return this.heartDiagnostic;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final Status.Icon getStatusIcon() {
        return this.statusIcon;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.statusIcon.hashCode() + h.a(this.iconRes, h.a(this.colorRes, h.a(this.value, h.a(this.type, this.heartDiagnostic.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        HeartDiagnostic heartDiagnostic = this.heartDiagnostic;
        int i11 = this.type;
        int i12 = this.value;
        int i13 = this.colorRes;
        int i14 = this.iconRes;
        Status.Icon icon = this.statusIcon;
        StringBuilder sb2 = new StringBuilder("HeartDiagnosticUI(heartDiagnostic=");
        sb2.append(heartDiagnostic);
        sb2.append(", type=");
        sb2.append(i11);
        sb2.append(", value=");
        v6.b.a(sb2, i12, ", colorRes=", i13, ", iconRes=");
        sb2.append(i14);
        sb2.append(", statusIcon=");
        sb2.append(icon);
        sb2.append(")");
        return sb2.toString();
    }
}
