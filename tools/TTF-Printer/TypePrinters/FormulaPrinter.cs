﻿using DocumentFormat.OpenXml.Packaging;
using log4net;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using TTI.TTF.Taxonomy.Model.Core;

namespace TTI.TTF.Taxonomy.TypePrinters
{
    static class ForumlaPrinter
    {
        private static readonly ILog _log;
        static ForumlaPrinter()
        {
            #region logging

            Utils.InitLog();
            _log = LogManager.GetLogger(MethodBase.GetCurrentMethod().DeclaringType);

            #endregion
        }

        public static void AddFomulaProperties(WordprocessingDocument document, TemplateFormula formula)
        {

        }
    }
}
