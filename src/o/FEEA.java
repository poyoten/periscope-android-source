// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package o;

import android.content.Context;
import android.net.Uri;

// Referenced classes of package o:
//            FB87, FF9D, FF85, _cls2110, 
//            _cls0138, FF69

public final class FEEA extends FB87
    implements _cls141F.if
{
    /* member class not found */
    class if {}


    public FEEA(Context context, _cls2110 _pcls2110)
    {
        super(context, _pcls2110);
    }

    protected final _cls0138 _mth02CA(Context context, Uri uri)
    {
        return new FF9D(context, uri);
    }

    protected final FF69 _mth02CF(Context context, String s)
    {
        return new FF85(context.getApplicationContext().getAssets(), s);
    }
}
