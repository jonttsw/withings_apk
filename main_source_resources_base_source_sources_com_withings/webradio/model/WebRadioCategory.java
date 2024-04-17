package com.withings.webradio.model;

import com.withings.webradio.WebRadios;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WebRadioCategory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/withings/webradio/model/WebRadioCategory;", "", "glyphId", "", "nameId", "airableId", "", "correspondingNode", "Lcom/withings/webradio/model/WebRadioNode;", "(Ljava/lang/String;IIILjava/lang/String;Lcom/withings/webradio/model/WebRadioNode;)V", "getAirableId", "()Ljava/lang/String;", "getCorrespondingNode", "()Lcom/withings/webradio/model/WebRadioNode;", "getGlyphId", "()I", "getNameId", "LocalRadio", "Trending", "Music", "Sports", "News", "Talk", "Country", "Language", "Ambient", "Mediative", "Classical", "Genres", "Search", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebRadioCategory {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WebRadioCategory[] $VALUES;
    private final String airableId;
    private final WebRadioNode correspondingNode;
    private final int glyphId;
    private final int nameId;
    public static final WebRadioCategory LocalRadio = new WebRadioCategory("LocalRadio", 0, C1987R.string.glyph_location, C1987R.string._WEBRADIOS_CATEGORY_LOCAL_, null, null, 8, null);
    public static final WebRadioCategory Trending = new WebRadioCategory("Trending", 1, C1987R.string.glyph_trend, C1987R.string._WEBRADIOS_CATEGORY_TRENDING_, null, null, 8, null);
    public static final WebRadioCategory Music = new WebRadioCategory("Music", 2, C1987R.string.glyph_music, C1987R.string._WEBRADIOS_CATEGORY_MUSIC_, WebRadios.AIRABLE_MUSIC_ID, null, 8, null);
    public static final WebRadioCategory Sports = new WebRadioCategory("Sports", 3, C1987R.string.glyph_sport, C1987R.string._WEBRADIOS_CATEGORY_SPORTS_, WebRadios.AIRABLE_SPORTS_ID, null, 8, null);
    public static final WebRadioCategory News = new WebRadioCategory("News", 4, C1987R.string.glyph_news, C1987R.string._WEBRADIOS_CATEGORY_NEWS_, WebRadios.AIRABLE_NEWS_ID, null, 8, null);
    public static final WebRadioCategory Talk = new WebRadioCategory("Talk", 5, C1987R.string.glyph_message, C1987R.string._WEBRADIOS_CATEGORY_TALK_, WebRadios.AIRABLE_TALK_ID, null, 8, null);
    public static final WebRadioCategory Country = new WebRadioCategory("Country", 6, C1987R.string.glyph_earth, C1987R.string._WEBRADIOS_CATEGORY_COUNTRY_, null, null, 8, null);
    public static final WebRadioCategory Language = new WebRadioCategory("Language", 7, C1987R.string.glyph_language, C1987R.string._WEBRADIOS_CATEGORY_LANGUAGE_, null, null, 8, null);
    public static final WebRadioCategory Ambient = new WebRadioCategory("Ambient", 8, C1987R.string.glyph_android, C1987R.string._WEBRADIOS_CATEGORY_AMBIENT_NATURE_, WebRadios.AIRABLE_AMBIANT_NATURE_ID, null, 8, null);
    public static final WebRadioCategory Mediative = new WebRadioCategory("Mediative", 9, C1987R.string.glyph_android, C1987R.string._WEBRADIOS_CATEGORY_MEDIATIVE_, WebRadios.AIRABLE_MEDIATIVE_ID, null, 8, null);
    public static final WebRadioCategory Classical = new WebRadioCategory("Classical", 10, C1987R.string.glyph_android, C1987R.string._WEBRADIOS_CATEGORY_CLASSICAL_, WebRadios.AIRABLE_CLASSICAL_ID, null, 8, null);
    public static final WebRadioCategory Genres = new WebRadioCategory("Genres", 11, C1987R.string.glyph_android, C1987R.string._WEBRADIOS_CATEGORY_GENRES_, null, null, 8, null);
    public static final WebRadioCategory Search = new WebRadioCategory("Search", 12, C1987R.string.glyph_search, C1987R.string._SELECT_, null, null, 8, null);

    private static final /* synthetic */ WebRadioCategory[] $values() {
        return new WebRadioCategory[]{LocalRadio, Trending, Music, Sports, News, Talk, Country, Language, Ambient, Mediative, Classical, Genres, Search};
    }

    static {
        WebRadioCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private WebRadioCategory(String str, int i11, int i12, int i13, String str2, WebRadioNode webRadioNode) {
        this.glyphId = i12;
        this.nameId = i13;
        this.airableId = str2;
        this.correspondingNode = webRadioNode;
    }

    public static a<WebRadioCategory> getEntries() {
        return $ENTRIES;
    }

    public static WebRadioCategory valueOf(String str) {
        return (WebRadioCategory) Enum.valueOf(WebRadioCategory.class, str);
    }

    public static WebRadioCategory[] values() {
        return (WebRadioCategory[]) $VALUES.clone();
    }

    public final String getAirableId() {
        return this.airableId;
    }

    public final WebRadioNode getCorrespondingNode() {
        return this.correspondingNode;
    }

    public final int getGlyphId() {
        return this.glyphId;
    }

    public final int getNameId() {
        return this.nameId;
    }

    /* synthetic */ WebRadioCategory(String str, int i11, int i12, int i13, String str2, WebRadioNode webRadioNode, int i14, m mVar) {
        this(str, i11, i12, i13, str2, (i14 & 8) != 0 ? null : webRadioNode);
    }
}
