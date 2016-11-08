import json
tips='02'
data={}
data['tips']=[]
line={}
line['type']='text'
line['content']='Click and drag tp fill multiple squares!'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/02.json'
data['tips'].append(line)
json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
