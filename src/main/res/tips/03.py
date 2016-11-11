import json
tips='03'
data={}
data['tips']=[]

line={}
line['type']='text'
line['content']='Look at this row:'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-1.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='The 4-square segment could be in placed either...'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-2.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-3.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Either way, these 3 squares are always filled:'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-4.json'
data['tips'].append(line)

json.dump(data,open('tips/'+ tips +'.json','w'),sort_keys=True)
