package com.withings.badge.model;

import ai.a;
import android.content.Context;
import com.withings.badge.model.BadgeModelUI;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: BadgeModelUI.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lai/a;", "Lbi/a;", "badgeImageUrlProvider", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/withings/badge/model/BadgeModelUI$UnlockedBadgeModelUI;", "toUnlockedUIModel", "(Lai/a;Lbi/a;Landroid/content/Context;)Lcom/withings/badge/model/BadgeModelUI$UnlockedBadgeModelUI;", "Lcom/withings/badge/model/BadgeModelUI$LockedBadgeModelUI;", "toLockedUIModel", "(Lai/a;Lbi/a;Landroid/content/Context;)Lcom/withings/badge/model/BadgeModelUI$LockedBadgeModelUI;", "", "getDescription", "(Lai/a;Landroid/content/Context;)Ljava/lang/String;", "badge_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BadgeModelUIKt {
    private static final String getDescription(a aVar, Context context) {
        int b10 = aVar.b();
        if (b10 != 1) {
            if (b10 != 40) {
                if (b10 != 36) {
                    if (b10 != 37) {
                        return "";
                    }
                    return String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.q()), aVar.o()}, 2));
                }
                return wq.a.b(context, C1987R.plurals.badge_steps_number, aVar.q(), Integer.valueOf(aVar.q()));
            }
            return String.format("%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.q()), aVar.o()}, 2));
        }
        return wq.a.b(context, C1987R.plurals.badge_weighIn_number, aVar.q(), Integer.valueOf(aVar.q()));
    }

    public static final BadgeModelUI.LockedBadgeModelUI toLockedUIModel(a aVar, bi.a badgeImageUrlProvider, Context context) {
        u.j(aVar, "<this>");
        u.j(badgeImageUrlProvider, "badgeImageUrlProvider");
        u.j(context, "context");
        long p11 = aVar.p();
        String d11 = aVar.d();
        String b10 = bi.a.b(aVar.d());
        String m11 = aVar.m();
        if (m11 == null) {
            m11 = "";
        }
        return new BadgeModelUI.LockedBadgeModelUI(p11, d11, b10, m11, getDescription(aVar, context));
    }

    public static final BadgeModelUI.UnlockedBadgeModelUI toUnlockedUIModel(a aVar, bi.a badgeImageUrlProvider, Context context) {
        u.j(aVar, "<this>");
        u.j(badgeImageUrlProvider, "badgeImageUrlProvider");
        u.j(context, "context");
        long p11 = aVar.p();
        String d11 = aVar.d();
        String b10 = bi.a.b(aVar.d());
        String m11 = aVar.m();
        if (m11 == null) {
            m11 = "";
        }
        return new BadgeModelUI.UnlockedBadgeModelUI(p11, d11, b10, m11, getDescription(aVar, context));
    }
}
