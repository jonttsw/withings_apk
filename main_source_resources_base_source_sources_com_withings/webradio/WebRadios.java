package com.withings.webradio;

import androidx.activity.b;
import com.withings.webradio.model.WebRadioNode;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WebRadios.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/withings/webradio/WebRadios;", "", "()V", "AIRABLE_AMBIANT_NATURE_ID", "", "AIRABLE_CLASSICAL_ID", "AIRABLE_MEDIATIVE_ID", "AIRABLE_MUSIC_ID", "AIRABLE_NEWS_ID", "AIRABLE_SPORTS_ID", "AIRABLE_TALK_ID", "AIRABLE_VERSION", "DEFAULT_RADIUS", "", "NUMBER_OF_RADIOS_TO_LOAD", "PREVIEW_DELAY", "getAirableBaseUrl", "getNodeForAirableId", "Lcom/withings/webradio/model/WebRadioNode;", "airableId", "webRadioNode", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebRadios {
    public static final String AIRABLE_AMBIANT_NATURE_ID = "7633181801065803";
    public static final String AIRABLE_CLASSICAL_ID = "1980926793999970";
    public static final String AIRABLE_MEDIATIVE_ID = "6843798430170865";
    public static final String AIRABLE_MUSIC_ID = "2543825879221484";
    public static final String AIRABLE_NEWS_ID = "4259184787981212";
    public static final String AIRABLE_SPORTS_ID = "7209068112075330";
    public static final String AIRABLE_TALK_ID = "6897709364537150";
    public static final String AIRABLE_VERSION = "1.1";
    public static final int DEFAULT_RADIUS = 100;
    public static final WebRadios INSTANCE = new WebRadios();
    public static final int NUMBER_OF_RADIOS_TO_LOAD = 50;
    public static final int PREVIEW_DELAY = 30000;

    private WebRadios() {
    }

    public static final WebRadioNode getNodeForAirableId(String str, WebRadioNode webRadioNode) {
        u.j(webRadioNode, "webRadioNode");
        if (u.e(webRadioNode.getId(), str)) {
            return webRadioNode;
        }
        List<WebRadioNode> children = webRadioNode.getChildren();
        Object obj = null;
        if (children == null) {
            return null;
        }
        Iterator<T> it = children.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (getNodeForAirableId(str, (WebRadioNode) next) != null) {
                obj = next;
                break;
            }
        }
        return (WebRadioNode) obj;
    }

    public final String getAirableBaseUrl() {
        Locale locale = Locale.getDefault();
        return b.b("/1.1/", locale.getLanguage(), "-", locale.getCountry());
    }
}
