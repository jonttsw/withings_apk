package com.withings.coach.chatbot;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.withings.coach.chatbot.n1;
import com.withings.insight.android.entity.Action;
import com.withings.insight.android.entity.Conversation;
import com.withings.insight.android.entity.Insight;
import com.withings.insight.android.entity.InsightContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nm0.k;
/* compiled from: ConversationParser.kt */
/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Insight f33120a;

    /* renamed from: b  reason: collision with root package name */
    private final a f33121b;

    /* compiled from: ConversationParser.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void G(String str);

        void U(l0 l0Var);
    }

    public v0(Insight insight, a onPreviewItemsListener) {
        kotlin.jvm.internal.u.j(insight, "insight");
        kotlin.jvm.internal.u.j(onPreviewItemsListener, "onPreviewItemsListener");
        this.f33120a = insight;
        this.f33121b = onPreviewItemsListener;
    }

    public static ArrayList c(List list, Map map) {
        Boolean bool;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Map<String, String> conditions = ((Action) obj).getConditions();
                if (conditions != null && !conditions.isEmpty()) {
                    for (Map.Entry<String, String> entry : conditions.entrySet()) {
                        if (map == null) {
                            break;
                        }
                        String str = (String) map.get(entry.getKey());
                        if (str != null) {
                            bool = Boolean.valueOf(dp0.j.o(str, new String[]{","}).contains(entry.getValue()));
                        } else {
                            bool = null;
                        }
                        if (bool == null) {
                            break;
                        } else if (!bool.booleanValue()) {
                            break;
                        }
                    }
                }
                arrayList2.add(obj);
            }
            arrayList = new ArrayList(kotlin.collections.x.y(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Action) it.next()).getAction());
            }
        }
        return arrayList;
    }

    private static String f(String str, Map map) {
        Object obj;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (dp0.j.r(str, (String) obj, false)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 != null) {
            return dp0.j.O(str, "$".concat(str2), (String) kotlin.collections.s0.e(map, str2), false);
        }
        return str;
    }

    public final Conversation a(String id2) {
        List<Conversation> list;
        Conversation conversation;
        Object a11;
        Object next;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.u.j(id2, "id");
        InsightContent content = this.f33120a.getContent();
        Object obj3 = null;
        if (content != null) {
            list = content.getConversation();
        } else {
            list = null;
        }
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.u.e(((Conversation) obj2).getMessageId(), id2)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            conversation = (Conversation) obj2;
        } else {
            conversation = null;
        }
        if (conversation == null) {
            if (list != null) {
                try {
                    Iterator<T> it2 = list.iterator();
                    if (!it2.hasNext()) {
                        next = null;
                    } else {
                        next = it2.next();
                        if (it2.hasNext()) {
                            int parseInt = Integer.parseInt(((Conversation) next).getMessageId());
                            do {
                                Object next2 = it2.next();
                                int parseInt2 = Integer.parseInt(((Conversation) next2).getMessageId());
                                if (parseInt > parseInt2) {
                                    next = next2;
                                    parseInt = parseInt2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    obj = (Conversation) next;
                } catch (Throwable th2) {
                    a11 = nm0.l.a(th2);
                }
            } else {
                obj = null;
            }
            a11 = obj;
            if (!(a11 instanceof k.a)) {
                obj3 = a11;
            }
            return (Conversation) obj3;
        }
        return conversation;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withings.coach.chatbot.l0 b(com.withings.insight.android.entity.Conversation r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "conversation"
            kotlin.jvm.internal.u.j(r10, r0)
            java.lang.String r0 = r10.getMessageId()
            r1 = 0
            if (r11 == 0) goto L3b
            java.lang.String r2 = r10.getContentTitle()
            r3 = 0
            java.lang.String r4 = "$"
            if (r2 == 0) goto L26
            boolean r5 = dp0.j.r(r2, r4, r3)
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 == 0) goto L26
            java.lang.String r2 = f(r2, r11)
            r10.setContentTitle(r2)
        L26:
            java.lang.String r2 = r10.getContent()
            boolean r3 = dp0.j.r(r2, r4, r3)
            if (r3 == 0) goto L31
            goto L32
        L31:
            r2 = r1
        L32:
            if (r2 == 0) goto L3b
            java.lang.String r11 = f(r2, r11)
            r10.setContent(r11)
        L3b:
            java.lang.String r11 = r10.getMessageType()
            java.lang.String r2 = "url_preview_bubble"
            boolean r11 = kotlin.jvm.internal.u.e(r11, r2)
            if (r11 == 0) goto L49
            r11 = r10
            goto L4a
        L49:
            r11 = r1
        L4a:
            if (r11 == 0) goto L84
            java.lang.String r11 = r11.getContent()
            if (r11 == 0) goto L84
            android.net.Uri r11 = android.net.Uri.parse(r11)
            if (r11 == 0) goto L84
            boolean r2 = r11.isOpaque()
            r2 = r2 ^ 1
            if (r2 == 0) goto L61
            goto L62
        L61:
            r11 = r1
        L62:
            if (r11 == 0) goto L84
            hm.d r11 = hm.c.a(r11)
            java.util.Map r2 = r11.d()
            if (r2 == 0) goto L77
            java.lang.String r3 = "os"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L78
        L77:
            r2 = r1
        L78:
            java.lang.String r3 = "ios"
            boolean r2 = kotlin.jvm.internal.u.e(r2, r3)
            r2 = r2 ^ 1
            if (r2 == 0) goto L84
            r6 = r11
            goto L85
        L84:
            r6 = r1
        L85:
            if (r6 == 0) goto Lb3
            java.util.Map r11 = r6.d()
            if (r11 == 0) goto Lb1
            java.lang.String r2 = "url"
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto Lb1
            com.withings.coach.chatbot.l0 r11 = new com.withings.coach.chatbot.l0
            r5 = 0
            java.lang.String r7 = "url_preview_bubble"
            r3 = 0
            r4 = 0
            r8 = 30
            r1 = r11
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = r11.d()
            if (r1 == 0) goto Lb0
            com.withings.coach.chatbot.v0$a r1 = r9.f33121b
            r1.U(r11)
        Lb0:
            r1 = r11
        Lb1:
            if (r1 != 0) goto Lcd
        Lb3:
            com.withings.coach.chatbot.l0 r11 = new com.withings.coach.chatbot.l0
            java.lang.String r3 = r10.getContentTitle()
            java.lang.String r4 = r10.getContent()
            java.lang.String r5 = r10.getBubbleGlyph()
            java.lang.String r7 = r10.getMessageType()
            r8 = 40
            r6 = 0
            r1 = r11
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        Lcd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.coach.chatbot.v0.b(com.withings.insight.android.entity.Conversation, java.util.Map):com.withings.coach.chatbot.l0");
    }

    public final l0 d() {
        String title;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Insight insight = this.f33120a;
        InsightContent content = insight.getContent();
        String str = null;
        if (content != null && (title = content.getTitle()) != null) {
            if (title.length() <= 0) {
                title = null;
            }
            if (title != null) {
                StyleSpan styleSpan = new StyleSpan(1);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) title);
                spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                kotlin.jvm.internal.u.i(spannableStringBuilder.append('\n'), "append(...)");
            }
        }
        InsightContent content2 = insight.getContent();
        if (content2 != null) {
            str = content2.getSubtitle();
        }
        spannableStringBuilder.append((CharSequence) str);
        return new l0(insight.getCrmId(), null, new SpannedString(spannableStringBuilder), null, null, "first_bubble", 58);
    }

    public final void e(l0 l0Var, String str) {
        Spanned spanned;
        CharSequence charSequence;
        String b10;
        String c11;
        new n1();
        n1.a a11 = n1.a(str);
        String str2 = null;
        if (a11 != null && (c11 = a11.c()) != null) {
            spanned = androidx.core.text.b.b(c11);
        } else {
            spanned = null;
        }
        l0Var.j(spanned);
        if (a11 == null || (b10 = a11.b()) == null || (charSequence = androidx.core.text.b.b(b10)) == null) {
            if (a11 != null) {
                charSequence = a11.d();
            } else {
                charSequence = null;
            }
        }
        l0Var.h(charSequence);
        if (a11 != null) {
            str2 = a11.a();
        }
        l0Var.i(str2);
        String d11 = l0Var.d();
        if (d11 != null) {
            this.f33121b.G(d11);
        }
    }
}
