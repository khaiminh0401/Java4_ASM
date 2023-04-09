<%@ page language="java" 
    pageEncoding="utf-8"%>
<div class="col-10 row">
	<div id="container" class="col-6 mx-3">
	</div>
	<div id="row" class="col-5"></div>
	<div id="table" class="mt-3"></div>
</div>
<script type="text/javascript">
var multiple_dataset = [
	{ sales:"20", sales2:"35", sales3:"55", year:"02" },
	{ sales:"40", sales2:"24", sales3:"40", year:"03" },
	{ sales:"44", sales2:"20", sales3:"27", year:"04" },
	{ sales:"23", sales2:"50", sales3:"43", year:"05" },
	{ sales:"21", sales2:"36", sales3:"31", year:"06" },
	{ sales:"50", sales2:"40", sales3:"56", year:"07" },
	{ sales:"30", sales2:"65", sales3:"75", year:"08" },
	{ sales:"90", sales2:"62", sales3:"55", year:"09" },
	{ sales:"55", sales2:"40", sales3:"60", year:"10" },
	{ sales:"72", sales2:"45", sales3:"54", year:"11" }
];

webix.ui({
  view:"chart",
  container:"container",
  width:600,
  height:250,
  type:"area",
  xAxis:{
    template:"'#year#"
  },
  yAxis:{
    start:0,
    step:10,
    end:100
  },
  legend:{
    values:[{text:"Type A",color:"#58dccd"},{text:"Type B",color:"#914ad8"},{text:"Type C",color:"#36abee"}],
    valign:"middle",
    align:"right",
    width:90,
    layout:"y"
  },
  eventRadius: 5,
  series:[
    {
      alpha:0.7,
      value:"#sales#",
      color: "#58dccd",
      tooltip:{
        template:"type: A<br/>value: #sales#"
      }
    },
    {
      alpha:0.5,
      value:"#sales2#",
      color:"#914ad8",
      tooltip:{
        template:"type: B<br/>value: #sales2#"
      }
    },
    {
      alpha:0.5,
      value:"#sales3#",
      color:"#36abee",
      tooltip:{
        template:"type: C<br/>value: #sales3#"
      }
    }
  ],
  data:multiple_dataset
});
var data = [
	  { val:"70", type:"Positive", color1: "#2ECC71", color2:"#AAB7B8" },
	  { val:"30", type:"Negative", color1: "#AAB7B8", color2:"#E74C3C" },
	];          

	webix.ui({
	  view: "scrollview",
	  container:"row",
	  scroll: "y",
	  height:250,
	  body: {
	    type:"clean",
	    cols:[
	      {
	        view: "chart",
	        donutInnerText: function(data, total) {
	          return "<span style='font-size:10px'>"+data[0].type+":</span><br>"+data[0].val+"%";
	        },
	        type:"donut",
	        innerRadius:70, 
	        value:"#val#",  
	        color:"#color1#",
	        height:250,
	        width:250,
	        data
	      }
	    ]
	  }
	});
	var grida = {
			  view:"datatable",
			  container:"table",
			    autoheight:true,
			    autowidth:true,
			  columns:[
			    { id:"title", header:"Film title", fillspace:4,adjust:true },
			    { id:"year", header:"Release year", fillspace:4,adjust:true },
			    { id:"votes", header:"Votes", fillspace:4,adjust:true }
			  ],
			  autoheight:true,
			  data:[
			    { id:1, title:"The Shawshank Redemption", year:1994, votes:678790},
			    { id:2, title:"The Godfather", year:1972, votes:511495}
			  ],
			  scrollX:false
			};

			webix.ready(function(){
			  webix.ui(grida);
			});
	</script>
