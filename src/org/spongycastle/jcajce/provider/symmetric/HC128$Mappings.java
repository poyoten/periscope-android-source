// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            HC128

public static class er extends AlgorithmProvider
{

    private static final String PREFIX = org/spongycastle/jcajce/provider/symmetric/HC128.getName();

    public final void _mth02CA(ConfigurableProvider configurableprovider)
    {
        configurableprovider._mth0640("Cipher.HC128", (new StringBuilder()).append(PREFIX).append("$Base").toString());
        configurableprovider._mth0640("KeyGenerator.HC128", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
    }


    public er()
    {
    }
}
